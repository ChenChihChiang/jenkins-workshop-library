#!/usr/bin/python
import sys,os
import time

if __name__ == '__main__':

   times = int(os.environ['PYTHON_TIMES'])
   for i in range(times):
      print("pythob loop" + " " + str(i))
