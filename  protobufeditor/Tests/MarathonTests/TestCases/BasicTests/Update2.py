useFixture(default)

def test():
	java_recorded_version = '1.6.0_17'

	if window('Protocol Buffer Editor'):
		select('FileChooser', '/C:/Program Files/RecordEdit/ProtoBuf/SampleFiles/protoStoreSales3a.bin')
		click('Edit1')
		select('JTreeTable', 'cell:Tree,1(null)')
		assert_p('JTreeTable', 'Content', '[[, , 20, Store: 20], [, , 59, Store: 59], [, , 166, Store: 166], [, , 184, Store: 184]]')
		select('JTreeTable', 'cell:Tree,1(null)')
		rightclick('JTreeTable', 'Tree,0')
		select('JTreeTable', 'cell:Tree,0(null)')
		rightclick('JTreeTable', 'Tree,0')
		select_menu('Expand Tree')
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,1')
		select_menu('Expand Tree')
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,2')
		select_menu('Expand Tree')
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,3')
		select('JTreeTable', 'cell:Tree,5(null)')
		rightclick('JTreeTable', 'Tree,5')
		select_menu('Expand Tree')
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,6')
		select_menu('Expand Tree')
##		click('BaseHelpPanel', 1021, 37)
		select('LayoutCombo', 'Product')
		select('JTreeTable', 'cell:saleDate,8(40118)')
		assert_p('JTreeTable', 'Content', '[[, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , 69684558, 40118, 1, 19000], [, , 69684558, 40118, -1, -19000], [, , 69684558, 40118, 1, 5010], [, , 69694158, 40118, 1, 19000], [, , 69694158, 40118, -1, -19000], [, , 69694158, 40118, 1, 5010], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ]]')
##		zzzz
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,7')
		select_menu('Edit Record')
		select('Table', 'cell:Data,1(40118)')
		assert_p('Table', 'Content', '[[keycode, 1, , 69684558, 69684558], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 19000, 19000]]')
		click('New1')
		select('Table', '11', 'Data,0')
		select('Table', '22', 'Data,1')
		select('Table', '33', 'Data,2')
		select('Table', '44', 'Data,3')
		select('Table', 'cell:Data,2(33)')
		assert_p('Table', 'Content', '[[keycode, 1, , 11, 11], [saleDate, 2, , 22, 22], [quantity, 3, , 33, 33], [price, 4, , 44, 44]]')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
		select_menu('Window>>protoStoreSales3a.bin>>Tree View')
		select('JTreeTable', 'cell:saleDate,9(40118)')
		assert_p('JTreeTable', 'Content', '[[, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , 11, 22, 33, 44], [, , 69684558, 40118, 1, 19000], [, , 69684558, 40118, -1, -19000], [, , 69684558, 40118, 1, 5010], [, , 69694158, 40118, 1, 19000], [, , 69694158, 40118, -1, -19000], [, , 69694158, 40118, 1, 5010], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ]]')
		select('JTreeTable', 'cell:Tree,9(null)')
		rightclick('JTreeTable', 'saleDate,9')
		select_menu('Repeat Record')
		select('JTreeTable', 'cell:saleDate,11(40118)')
		assert_p('JTreeTable', 'Content', '[[, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , 11, 22, 33, 44], [, , 69684558, 40118, 1, 19000], [, , 69684558, 40118, -1, -19000], [, , 69684558, 40118, -1, -19000], [, , 69684558, 40118, 1, 5010], [, , 69694158, 40118, 1, 19000], [, , 69694158, 40118, -1, -19000], [, , 69694158, 40118, 1, 5010], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ]]')
##		zzzzzz
		click('BasicInternalFrameTitlePane$NoFocusButton2')

		if window('Save Changes to file: /C:/Program Files/RecordEdit/ProtoBuf/SampleFiles/protoStoreSales3a.bin'):
			click('Yes')
		close()

		click('Edit1')
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,0')
		select_menu('Expand Tree')
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,1')
		select_menu('Expand Tree')
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,3')
		select_menu('Expand Tree')
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,4')
		select_menu('Expand Tree')
		select('LayoutCombo', 'Product')
		select('JTreeTable', 'cell:saleDate,7(40118)')
		assert_p('JTreeTable', 'Content', '[[, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , 11, 22, 33, 44], [, , 69684558, 40118, 1, 19000], [, , 69684558, 40118, -1, -19000], [, , 69684558, 40118, -1, -19000], [, , 69684558, 40118, 1, 5010], [, , 69694158, 40118, 1, 19000], [, , 69694158, 40118, -1, -19000], [, , 69694158, 40118, 1, 5010], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ]]')
		select('JTreeTable', 'cell:quantity,5(33)')
		click('Delete2')
		select('JTreeTable', 'cell:saleDate,7(40118)')
		click('Delete2')
		select('JTreeTable', 'cell:saleDate,6(40118)')
		assert_p('JTreeTable', 'Content', '[[, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , 69684558, 40118, 1, 19000], [, , 69684558, 40118, -1, -19000], [, , 69684558, 40118, 1, 5010], [, , 69694158, 40118, 1, 19000], [, , 69694158, 40118, -1, -19000], [, , 69694158, 40118, 1, 5010], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ], [, , , , , ]]')
		click('Save1')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
	close()
