package net.sf.RecordEditor.zProtoBuf.zTest.BuildData;

import java.io.FileOutputStream;

import net.sf.RecordEditor.ProtoBuf.JRecord.Def.ProtoHelper;

import com.example.tutorial.AddressBookProtosSD1;
import com.example.tutorial.AddressBookProtosSD1.AddressBook;
import com.example.tutorial.AddressbookSD1Person.Person;
import com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber;
import com.example.tutorial.AddressbookSD1PersonEnum.PhoneType;


public class TestAddSD1 {

//	static String filename = "/home/bm/Work/Temp/ProtoBuffers/ProtoTest_Address1_SD.bin";
//	static PhoneType[] type = {null, Person.PhoneType.MOBILE, Person.PhoneType.HOME, Person.PhoneType.WORK};
//	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		AddressBook.Builder addressBook = AddressBook.newBuilder();
		Person p;
//		byte[] b;
//		int temp;
		 String filename = "/home/bm/Work/Temp/ProtoBuffers/ProtoTest_Address1_SD1.bin";
		 PhoneType[] type = {null, PhoneType.MOBILE, PhoneType.HOME, PhoneType.WORK};
	
		for (int i = 1; i <50; i++) {
			Person.Builder person = Person.newBuilder();
			person.setId(1000 + i);
			person.setName("name_" + i);
			person.setEmail("me_" + i + "@yahoo.com.au");
			for (int j=1; j < 4; j++) {
				PhoneNumber.Builder phoneNumber =
			        PhoneNumber.newBuilder().setNumber(((10 + j)*10000 + i) + "");
				phoneNumber.setType(type[j]);
				
				person.addPhone(phoneNumber);
			}
			p = person.build();
			addressBook.addPerson(p);
		}

		addressBook.setProtoFiles(ProtoHelper.getFileDescriptorSet(AddressBookProtosSD1.getDescriptor()));
	    FileOutputStream output = new FileOutputStream(filename);
	    addressBook.build().writeTo(output);

	    output.close();

	}

}
