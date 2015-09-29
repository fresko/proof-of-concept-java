package com.quiz.august.september.app;



/**
 * @mail juan.paz.h@gmail.com
 * @author FRESKO2
 *
 */
public class BytesToHexaToDec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Un byte =  8 bit
		 byte arrayBytes [] = new byte[2];
		 arrayBytes[0] = (byte) 0b10000001;  //81 HexDecimal
	     arrayBytes[1] = (byte) 0b1001;		 //9  Hexadecimal 
	     
	     //Data in Hex
	     System.out.println("arrayBytes[0] Hex : "+ Integer.toHexString(arrayBytes[0] & 0xFF));
	     System.out.println("arrayBytes[1] Hex : "+ Integer.toHexString(arrayBytes[1] & 0xFF));
	   	     
	     //Un short =  16 bit
	     short testDataMerge = (short) 0b100110000001;	// 981 Concatenated Data Hexadecimal
	     System.out.println("Test Data to Merge  : "+testDataMerge);
	     
	     //Merge of bytes part Low and High 
	     short concatenatedData = mergebytes(arrayBytes[1],arrayBytes[0]);
	     System.out.println("Dec Concatenated : "+ concatenatedData);
	     
	     //Test Operation with int data and short data
	     int intData = 10;
	     int testOperation = intData + concatenatedData;
	     System.out.println("testOperation : "+ testOperation);
	     
         
    }
	/**
	 * Method that concatenates two bytes(8 bit + 8 bit) 
	 * it used (b & 0xFF) for data high how to 81Hex ; Java add a symbol of negative  when it converted to decimal  
	 * unsigned
	 * @param byte a
	 * @param byte b
	 * @return short include (16 bit) and return concatenated_data
	 */
	private static short mergebytes(byte a, byte b) {
	    short concatenatedData = (short)a;
	    concatenatedData =  (short) ((concatenatedData << 8) | b & 0xFF);
	    return concatenatedData;
	} 
   
	
}
