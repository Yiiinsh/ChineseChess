# -*- coding: utf-8 -*- 
import csv, os, re
from collections import namedtuple

with open('RulesTestCase.csv') as source :
	source_csv = csv.reader(source)
	
	headers = next(source_csv) # Fetch headers
	descriptions = next(source_csv) # Fetch headers' description

	cnt_success = 0
	cnt_fail = 0
	cnt_all = 0
	test_version = 0

	with open('RulesTestResult.csv','w') as target :
		target_csv = csv.writer(target)
		target_csv.writerow(headers)
		target_csv.writerow(descriptions)

		Row = namedtuple('Row', headers)
		for r in source_csv :
			cnt_all += 1
			# Fetch Test Case
			row = Row(*r)
			test_version = row.Version

			# Execute the java module
			if row.Input3 == 'NA' :
				cmd = ' '.join(('java', 'Chess.Rules', row.Input1, row.Input2, row.Input3))
				ret = os.popen(cmd)
				ret = ret.read()
				ret = ret[:-2] # Eliminate the last \n tag
			elif row.Input3.index(',') >= 0:
				sub_cmd = row.Input3.split(',')
				cmd = ' '.join(('java', 'Chess.Rules', row.Input1, row.Input2, row.Input3, sub_cmd[0], sub_cmd[1], sub_cmd[2]))
				ret = os.popen(cmd)
				ret = ret.read()
				ret = ret[:-2] # Eliminate the last \n tag
			else:
				continue

			# Result check
			returns = re.split(r'-', ret)
			res = all(row.ExpectationOutput.find(tmp_str)>=0 for tmp_str in returns)

			if res == True :
				cnt_success += 1
			else :
				cnt_fail += 1

			print row.TCNO,':' , res

			# Result output
			target_csv.writerow(('', row.TCNO, row.Input1, row.Input2, row.Input3, row.ExpectationOutput, returns, '0', row.Method, row.Version, row.Purpose, res, ''))

	with open('RulesTestTrend.csv','a') as trend :
		writter = csv.writer(trend)
		writter.writerow((test_version, cnt_all, cnt_success, cnt_fail))


# 