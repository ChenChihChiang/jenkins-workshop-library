#!/usr/bin/python
import sys,os 

if __name__ == '__main__':

	times = int(os.environ['PYTHON_TIMES'])
	for i in range(times):
		print(i)
		sleep 1
