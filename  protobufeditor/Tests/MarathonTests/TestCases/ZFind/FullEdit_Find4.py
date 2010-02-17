useFixture(default)

def test():
	from Modules import commonBits
	java_recorded_version = '1.5.0_11'

	if window('Protocol Buffer Editor'):
		select('FileChooser', commonBits.sampleDir() + 'Ams_LocDownload_20041228.bin')
		#commonBits.setRecordLayout(select, 'ams Store')

		click('Edit1')
		select('Table', 'cell:2|Loc_Nbr,0(5839)')
		rightclick('Table', '4|Loc_Name,0')
		select_menu('Edit Record')
		click('Find1')
		#click('MetalInternalFrameTitlePane', 217, 13)
		select('TextField', 'West')
		click('Find1')
		click('Find1')
		select('Table', 'cell:Data,4(Westfield Shoppingtown)')
		select('Table', 'cell:Data,4(Westfield Shoppingtown)')
		assert_p('Table', 'Text', 'Cnr. Urunga Pde & The Kingsway', 'Data,5')
		select('Table', 'cell:Data,5(Cnr. Urunga Pde & The Kingsway)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5037, 5037], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Miranda, Miranda], [Loc_Addr_Ln1, 5, , Westfield Shoppingtown, Westfield Shoppingtown], [Loc_Addr_Ln2, 6, , Cnr. Urunga Pde & The Kingsway, Cnr. Urunga Pde & The Kingsway], [Loc_Addr_Ln3, 7, , Miranda, Miranda], [Loc_Postcode, 8, , 2228, 2228], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,5(Cnr. Urunga Pde & The Kingsway)')
		click('Find1')
		select('TextField', 'West')

		click('Find1')
		select('Table', 'cell:Data,5(Northumberland Street)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5093, 5093], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Liverpool, Liverpool], [Loc_Addr_Ln1, 5, , Westfield Phoenix Plaza, Westfield Phoenix Plaza], [Loc_Addr_Ln2, 6, , Northumberland Street, Northumberland Street], [Loc_Addr_Ln3, 7, , Liverpool, Liverpool], [Loc_Postcode, 8, , 2170, 2170], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,5(Northumberland Street)')
		click('Find1')
		select('TextField', 'West')

		click('Find1')
		select('Table', 'cell:Data,5(152 Bunnerong Road)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5095, 5095], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Eastgarden, Eastgarden], [Loc_Addr_Ln1, 5, , Westfield Shoppingtown Eastgardens, Westfield Shoppingtown Eastgardens], [Loc_Addr_Ln2, 6, , 152 Bunnerong Road, 152 Bunnerong Road], [Loc_Addr_Ln3, 7, , Eastgardens, Eastgardens], [Loc_Postcode, 8, , 2036, 2036], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,5(152 Bunnerong Road)')
		click('Find1')
		select('ComboBox2', 'Backward')
		assert_p('ComboBox2', 'Text', 'Backward')
		click('Find1')
		select('Table', 'cell:Data,5(Northumberland Street)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5093, 5093], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Liverpool, Liverpool], [Loc_Addr_Ln1, 5, , Westfield Phoenix Plaza, Westfield Phoenix Plaza], [Loc_Addr_Ln2, 6, , Northumberland Street, Northumberland Street], [Loc_Addr_Ln3, 7, , Liverpool, Liverpool], [Loc_Postcode, 8, , 2170, 2170], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,4(Westfield Phoenix Plaza)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5093, 5093], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Liverpool, Liverpool], [Loc_Addr_Ln1, 5, , Westfield Phoenix Plaza, Westfield Phoenix Plaza], [Loc_Addr_Ln2, 6, , Northumberland Street, Northumberland Street], [Loc_Addr_Ln3, 7, , Liverpool, Liverpool], [Loc_Postcode, 8, , 2170, 2170], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,4(Westfield Phoenix Plaza)')
		click('Find1')
		select('ComboBox2', 'Backward')
		click('Find1')
		select('Table', 'cell:Data,4(Westfield Shoppingtown)')
		assert_p('Table', 'Text', 'Westfield Shoppingtown', 'Data,4')
		select('Table', 'cell:Data,5(Cnr. Urunga Pde & The Kingsway)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5037, 5037], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Miranda, Miranda], [Loc_Addr_Ln1, 5, , Westfield Shoppingtown, Westfield Shoppingtown], [Loc_Addr_Ln2, 6, , Cnr. Urunga Pde & The Kingsway, Cnr. Urunga Pde & The Kingsway], [Loc_Addr_Ln3, 7, , Miranda, Miranda], [Loc_Postcode, 8, , 2228, 2228], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,5(Cnr. Urunga Pde & The Kingsway)')
		click('Find1')
		select('ComboBox2', 'Backward')
		click('Find1')
		select('Table', 'cell:Data,3(VIC West Ad Support)')
		assert_p('Table', 'Text', 'cell:Data,3(VIC West Ad Support)')
		select('Table', 'cell:Data,5(Lot 2 Little Boundary Rd)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5850, 5850], [Loc_Type, 3, , DC, DC], [Loc_Name, 4, , VIC West Ad Support, VIC West Ad Support], [Loc_Addr_Ln1, 5, , , ], [Loc_Addr_Ln2, 6, , Lot 2 Little Boundary Rd, Lot 2 Little Boundary Rd], [Loc_Addr_Ln3, 7, , Laverton, Laverton], [Loc_Postcode, 8, , 3028, 3028], [Loc_State, 9, , VIC, VIC], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,5(Lot 2 Little Boundary Rd)')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
		#click('MetalInternalFrameTitlePane', 896, 16)
		#click('BasicInternalFrameTitlePane$NoFocusButton2')
	close()
