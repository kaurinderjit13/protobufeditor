useFixture(default)

def test():
	java_recorded_version = '1.6.0_17'

	if window('Protocol Buffer Editor'):
		select('FileChooser', '/C:/Program Files/RecordEdit/ProtoBuf/SampleFiles/protoStoreSales3.bin')
		##assert_p('FileChooser1', 'Text', r'C:\Program Files\RecordEdit\ProtoBuf/CopyBook/StoreSales3.protocomp')
		##select('ComboBox3', 'Store')
		click('Edit1')
		select('JTreeTable', 'cell:Tree,1(null)')
		assert_p('JTreeTable', 'Content', '[[, , 20, Store: 20], [, , 59, Store: 59], [, , 166, Store: 166], [, , 184, Store: 184]]')
		##select('JTreeTable', 'cell:Tree,2(null)')

		rightclick('JTreeTable', 'Tree,1')
		select_menu('Expand Tree')

		select('JTreeTable', 'cell:Tree,2(null)')
		rightclick('JTreeTable', 'Tree,2')
		select_menu('Expand Tree')

		select('LayoutCombo', 'Deptartment')
		select('JTreeTable', 'cell:Tree,4(null)')
		assert_p('JTreeTable', 'Content', '[[, , , ], [, , , ], [, , , ], [, , 335, Department: 335], [, , 410, Department: 410], [, , 620, Department: 620], [, , 878, Department: 878], [, , 929, Department: 929], [, , 957, Department: 957], [, , , ], [, , , ], [, , , ], [, , , ]]')
		##assert_p('JTreeTable', 'Content', '[[, , , ], [, , , ], [, , , ], [, , 335, Department: 335], [, , 410, Department: 410], [, , 620, Department: 620], [, , 878, Department: 878], [, , 929, Department: 929], [, , 957, Department: 957], [, , , ], [, , , ], [, , , ], [, , , ], [, , , ], [, , , ], [, , , ]]')
		select('JTreeTable', 'cell:Tree,4(null)')
		rightclick('JTreeTable', 'Tree,4')
		select_menu('Edit Record')
		select('JTreeTable', 'cell:Tree,4(null)')
		select('Table', 'cell:Data,0(410)')
		assert_p('Table', 'Content', '[[department, 1, , 410, 410], [name, 2, , Department: 410, Department: 410]]')
		click('Right')
		select('Table', 'cell:Data,1(Department: 620)')
		assert_p('Table', 'Content', '[[department, 1, , 620, 620], [name, 2, , Department: 620, Department: 620]]')
		select('Table', 'cell:Data,1(Department: 620)')
		click('Down')
		select('Table', 'cell:Data,1(40118)')
		assert_p('Table', 'Content', '[[keycode, 1, , 60664659, 60664659], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 3990, 3990]]')
		click('Right')
		select('Table', 'cell:Data,3(3990)')
		assert_p('Table', 'Content', '[[keycode, 1, , 60694698, 60694698], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 3990, 3990]]')
		click('Right')
		select('Table', 'cell:Data,1(7980)')
		assert_p('Table', 'Content', '[[quantity, 1, , 2, 2], [price, 2, , 7980, 7980], [count, 3, , 2, 2]]')
		click('Up')
		select('Table', 'cell:Data,1(Department: 620)')
		assert_p('Table', 'Content', '[[department, 1, , 620, 620], [name, 2, , Department: 620, Department: 620]]')
		select('Table', 'cell:Data,1(Department: 620)')
		click('Up')
		select('Table', 'cell:Data,0(59)')
		assert_p('Table', 'Content', '[[store, 1, , 59, 59], [name, 2, , Store: 59, Store: 59]]')
		click('Down')
		select('Table', 'cell:Data,0(335)')
		assert_p('Table', 'Content', '[[department, 1, , 335, 335], [name, 2, , Department: 335, Department: 335]]')
		click('Up')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
	close()
