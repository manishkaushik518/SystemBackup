'''
Created on Mar 25, 2018

@author: MAC
'''
#Importing the library
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

#Importing the file
dataset= pd.read_csv('Data.csv')
X=dataset.iloc[:,:-1].values
Y=dataset.iloc[:,3].values


#Taking care of missing data
from sklearn.preprocessing import Imputer
imputer= Imputer(missing_values="NaN",strategy="mean",axis=0)
imputer=imputer.fit(X[:,1:3])
X[:,1:3]=imputer.transform(X[:,1:3])


#Encoding Categorical data 
from sklearn.preprocessing import LabelEncoder,OneHotEncoder
lableEncoder_X= LabelEncoder()
X[:,0]=lableEncoder_X.fit_transform(X[:,0])
oneHotEncoder=OneHotEncoder(categorical_features=[0])
X=oneHotEncoder.fit_transform(X).toarray()
lableEncoder_Y= LabelEncoder()
Y=lableEncoder_X.fit_transform(Y)

#Splitting the data set into Test and train
from sklearn.cross_validation import train_test_split
X_train,X_test,Y_train,Y_test=train_test_split(X,Y,test_size=0.2,random_state=0)

#Feature Scaling
from sklearn.preprocessing import StandardScaler
sc_X=StandardScaler()
X_train=sc_X.fit_transform(X_train)
X_test=sc_X.fit_transform(X_test)  


