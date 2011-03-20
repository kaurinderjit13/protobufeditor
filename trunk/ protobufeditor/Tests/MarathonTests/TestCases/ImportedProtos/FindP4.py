useFixture(default)

def test():
	from Modules import commonBits
	java_recorded_version = '1.6.0_17'
	if window('Protocol Buffer Editor'):
		select('FileChooser', commonBits.sampleDir() + 'protoStoreSales3im.bin')
		click('Edit1')
##		select('JTreeTable', '')
		rightclick('JTreeTable', 'Tree,0')
		select_menu('Edit Record')
		click('Find1')
##		click('MetalInternalFrameTitlePane', 210, 9)
		select('TextField', '66')
		select('LayoutCombo', 'Product')
		select('ComboBox', 'keycode')
		click('Find1')
		select_menu('Window>>protoStoreSales3im.bin>>Record: ')
		select('Table', 'cell:Data,1(40118)')
		assert_p('Table', 'Content', '[[keycode, 1, , 66624458, 66624458], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 890, 890]]')
		click('Find1')
		select('LayoutCombo', 'Product')
		select('ComboBox', 'keycode')
		click('Find1')
		select_menu('Window>>protoStoreSales3im.bin>>Record: ')
		select('Table', 'cell:Data,1(40118)')
		assert_p('Table', 'Content', '[[keycode, 1, , 61664713, 61664713], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 17990, 17990]]')
		click('Find1')
		select('ComboBox', 'keycode')
		click('Find1')
		select_menu('Window>>protoStoreSales3im.bin>>Record: ')
		select('Table', 'cell:Data,1(40118)')
		assert_p('Table', 'Content', '[[keycode, 1, , 61664713, 61664713], [saleDate, 2, , 40118, 40118], [quantity, 3, , -1, -1], [price, 4, , -17990, -17990]]')
		select_menu('Window>>protoStoreSales3im.bin>>Record: ')
		click('Find1')
		select('ComboBox', 'keycode')
		click('Find1')
		select_menu('Window>>protoStoreSales3im.bin>>Record: ')
		select('Table', 'cell:Data,0(60664659)')
		assert_p('Table', 'Content', '[[keycode, 1, , 60664659, 60664659], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 3990, 3990]]')
		click('Find1')
		select('ComboBox', 'keycode')
		click('Find1')
		select_menu('Window>>protoStoreSales3im.bin>>Record: ')
		select('Table', 'cell:Data,2(1)')
		assert_p('Table', 'Content', '[[keycode, 1, , 68664211, 68664211], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 11190, 11190]]')
		click('Find1')
		select('ComboBox', 'keycode')
		click('Find1')
		select_menu('Window>>protoStoreSales3im.bin>>Record: ')
		select('Table', 'cell:Data,0(69634660)')
		assert_p('Table', 'Content', '[[keycode, 1, , 69634660, 69634660], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 12000, 12000]]')
		click('Find1')
		select('LayoutCombo', 'Product')
		select('ComboBox', 'keycode')
		click('Find1')
		select_menu('Window>>protoStoreSales3im.bin>>Record: ')
		select('Table', 'cell:Data,0(60664241)')
		assert_p('Table', 'Content', '[[keycode, 1, , 60664241, 60664241], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 9000, 9000]]')
		click('Find1')
		select('LayoutCombo', 'Product')
		select('ComboBox', 'keycode')
		click('Find1')
		select_menu('Window>>protoStoreSales3im.bin>>Record: ')
		select('Table', 'cell:Data,1(40118)')
		assert_p('Table', 'Content', '[[keycode, 1, , 60664302, 60664302], [saleDate, 2, , 40118, 40118], [quantity, 3, , 1, 1], [price, 4, , 9000, 9000]]')

	close()