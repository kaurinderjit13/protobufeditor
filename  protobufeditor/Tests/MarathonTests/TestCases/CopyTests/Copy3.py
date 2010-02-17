useFixture(default)

def test():
	java_recorded_version = '1.6.0_17'

	if window('Protocol Buffer Editor'):
		select('FileChooser', '/C:/Program Files/RecordEdit/ProtoBuf/SampleFiles/protoStoreSales3a.bin')
		click('Edit1')
		select('JTreeTable', 'cell:Tree,1(null)')
		select_menu('Edit>>Copy Record#{s#}')
		select('JTreeTable', 'cell:Tree,3(null)')
		select_menu('Edit>>Paste Record#{s#}')
##		select('JTreeTable', 'cell:Tree,3(null)')
		assert_p('JTreeTable', 'Content', '[[, , 20, Store: 20], [, , 59, Store: 59], [, , 166, Store: 166], [, , 184, Store: 184], [, , 59, Store: 59]]')
		select('JTreeTable', 'cell:Tree,3(null)')
		select_menu('File>>Compare with Disk')
		select('JTreeTable', 'cell:Tree,3(null)')
		select('Table', 'cell:keycode,5(61664713)')
		assert_p('Table', 'Content', '[[, , , , , , ], [, Inserted, 856, 59, Store: 59, , ], [, , , , , , ], [, Inserted, 857, 335, Department: 335, , ], [, , , , , , ], [, Inserted, 858, 61664713, 40118, 1, 17990], [, , , , , , ], [, Inserted, 859, 61664713, 40118, -1, -17990], [, , , , , , ], [, Inserted, 860, 61684613, 40118, 1, 12990], [, , , , , , ], [, Inserted, 861, 1, 12990, 3, ], [, , , , , , ], [, Inserted, 862, 410, Department: 410, , ], [, , , , , , ], [, Inserted, 863, 68634752, 40118, 1, 8990], [, , , , , , ], [, Inserted, 864, 1, 8990, 1, ], [, , , , , , ], [, Inserted, 865, 620, Department: 620, , ], [, , , , , , ], [, Inserted, 866, 60664659, 40118, 1, 3990], [, , , , , , ], [, Inserted, 867, 60694698, 40118, 1, 3990], [, , , , , , ], [, Inserted, 868, 2, 7980, 2, ], [, , , , , , ], [, Inserted, 869, 878, Department: 878, , ], [, , , , , , ], [, Inserted, 870, 60614487, 40118, 1, 5950], [, , , , , , ], [, Inserted, 871, 63644339, 40118, 1, 12650], [, , , , , , ], [, Inserted, 872, 2, 18600, 2, ], [, , , , , , ], [, Inserted, 873, 929, Department: 929, , ], [, , , , , , ], [, Inserted, 874, 67674686, 40118, 1, 3990], [, , , , , , ], [, Inserted, 875, 1, 3990, 1, ], [, , , , , , ], [, Inserted, 876, 957, Department: 957, , ], [, , , , , , ], [, Inserted, 877, 62684217, 40118, 1, 9990], [, , , , , , ], [, Inserted, 878, 64614401, 40118, 1, 1990], [, , , , , , ], [, Inserted, 879, 64614401, 40118, 1, 1990], [, , , , , , ], [, Inserted, 880, 64624770, 40118, 1, 2590], [, , , , , , ], [, Inserted, 881, 4, 16560, 4, ], [, , , , , , ], [, Inserted, 882, 61684613, 1, , ], [, , , , , , ], [, Inserted, 883, 68634752, 1, , ], [, , , , , , ], [, Inserted, 884, 60664659, 1, , ], [, , , , , , ], [, Inserted, 885, 60694698, 1, , ], [, , , , , , ], [, Inserted, 886, 60614487, 1, , ], [, , , , , , ], [, Inserted, 887, 63644339, 1, , ], [, , , , , , ], [, Inserted, 888, 67674686, 1, , ], [, , , , , , ], [, Inserted, 889, 62684217, 1, , ], [, , , , , , ], [, Inserted, 890, 64614401, 2, , ], [, , , , , , ], [, Inserted, 891, 64624770, 1, , ], [, , , , , , ], [, Inserted, 892, 11, 69110, 13, ]]')
		select('Table', 'cell:keycode,5(61664713)')
##		assert_p('TextPane', 'Text', '')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
		select('JTreeTable', 'cell:Tree,3(null)')
		select('JTreeTable', 'cell:Tree,3(null)')
		select_menu('Window>>protoStoreSales3a.bin>>Tree View')
		select('JTreeTable', 'cell:Tree,3(null)')
		click('Save')
		select_menu('File>>Compare with Disk')
		assert_p('TextPane', 'Text', 'Files are Identical !!!')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
		select('JTreeTable', 'cell:Tree,3(null)')
		select('JTreeTable', 'cell:Tree,4(null)')
		click('Delete1')
		select('JTreeTable', 'cell:Tree,0(null)')
		assert_p('JTreeTable', 'Content', '[[, , 20, Store: 20], [, , 59, Store: 59], [, , 166, Store: 166], [, , 184, Store: 184]]')
		select('JTreeTable', 'cell:Tree,0(null)')
		select_menu('File>>Compare with Disk')
##		select('JTreeTable', 'cell:Tree,0(null)')
		select('Table', 'cell:keycode,4(61664713)')
		assert_p('Table', 'Content', '[[, Deleted, 856, 59, Store: 59, , ], [, , , , , , ], [, Deleted, 857, 335, Department: 335, , ], [, , , , , , ], [, Deleted, 858, 61664713, 40118, 1, 17990], [, , , , , , ], [, Deleted, 859, 61664713, 40118, -1, -17990], [, , , , , , ], [, Deleted, 860, 61684613, 40118, 1, 12990], [, , , , , , ], [, Deleted, 861, 1, 12990, 3, ], [, , , , , , ], [, Deleted, 862, 410, Department: 410, , ], [, , , , , , ], [, Deleted, 863, 68634752, 40118, 1, 8990], [, , , , , , ], [, Deleted, 864, 1, 8990, 1, ], [, , , , , , ], [, Deleted, 865, 620, Department: 620, , ], [, , , , , , ], [, Deleted, 866, 60664659, 40118, 1, 3990], [, , , , , , ], [, Deleted, 867, 60694698, 40118, 1, 3990], [, , , , , , ], [, Deleted, 868, 2, 7980, 2, ], [, , , , , , ], [, Deleted, 869, 878, Department: 878, , ], [, , , , , , ], [, Deleted, 870, 60614487, 40118, 1, 5950], [, , , , , , ], [, Deleted, 871, 63644339, 40118, 1, 12650], [, , , , , , ], [, Deleted, 872, 2, 18600, 2, ], [, , , , , , ], [, Deleted, 873, 929, Department: 929, , ], [, , , , , , ], [, Deleted, 874, 67674686, 40118, 1, 3990], [, , , , , , ], [, Deleted, 875, 1, 3990, 1, ], [, , , , , , ], [, Deleted, 876, 957, Department: 957, , ], [, , , , , , ], [, Deleted, 877, 62684217, 40118, 1, 9990], [, , , , , , ], [, Deleted, 878, 64614401, 40118, 1, 1990], [, , , , , , ], [, Deleted, 879, 64614401, 40118, 1, 1990], [, , , , , , ], [, Deleted, 880, 64624770, 40118, 1, 2590], [, , , , , , ], [, Deleted, 881, 4, 16560, 4, ], [, , , , , , ], [, Deleted, 882, 61684613, 1, , ], [, , , , , , ], [, Deleted, 883, 68634752, 1, , ], [, , , , , , ], [, Deleted, 884, 60664659, 1, , ], [, , , , , , ], [, Deleted, 885, 60694698, 1, , ], [, , , , , , ], [, Deleted, 886, 60614487, 1, , ], [, , , , , , ], [, Deleted, 887, 63644339, 1, , ], [, , , , , , ], [, Deleted, 888, 67674686, 1, , ], [, , , , , , ], [, Deleted, 889, 62684217, 1, , ], [, , , , , , ], [, Deleted, 890, 64614401, 2, , ], [, , , , , , ], [, Deleted, 891, 64624770, 1, , ], [, , , , , , ], [, Deleted, 892, 11, 69110, 13, ], [, , , , , , ]]')
		select('Table', 'cell:keycode,4(61664713)')
##		assert_p('TextPane', 'Text', '')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
		select('JTreeTable', 'cell:Tree,0(null)')
		select('JTreeTable', 'cell:Tree,0(null)')
		select_menu('Window>>protoStoreSales3a.bin>>Tree View')
		select('JTreeTable', 'cell:Tree,0(null)')
		click('Save')
		select_menu('File>>Compare with Disk')
		assert_p('TextPane', 'Text', 'Files are Identical !!!')
	close()
