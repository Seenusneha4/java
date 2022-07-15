public class StringManipulation
{
public static void main(String[] args)
{
System.out.println("\n \n****Creating_of_Strings****");
char arrSample[]={'R', 'O','S','E'};
String strSample_1=new String(arrSample);
System.out.println("\n Created_from_char[]_using_new_String:"+strSample_1);
byte ascii[]={65,66,67,68,69,70};
String strSample_2=new String(ascii);
System.out.println("\n Created from byte[]:"+strSample_2);

System.out.println("\n****Getting_String_length****");
System.out.println("\n Length of " +strSample_1+" is "+strSample_1.length());

System.out.println("\n****String_concatenation****");
String strSample_3=strSample_1.concat(strSample_2);
System.out.println("\n using concat(): "+strSample_3);
String strSample_4=strSample_1+strSample_2;
System.out.println("\n using + operator: "+strSample_4);

System.out.println("\n****String comparison****");
System.out.println("\n \n ######USING COMPARETO######");
String str_Sample="RockStar";
System.out.println("\n Compare 'RockStar' To 'ROCKSTAR':"+str_Sample.compareTo("ROCKSTAR"));
System.out.println("\n Compare 'RockStar' To 'ROCKSTAR' Case ignored:"+str_Sample.compareToIgnoreCase("ROCKSTAR"));

System.out.println("\n \n ######USING EQUALS######");
System.out.println("\n 'RockStar' equals('ROCKSTAR') is:"+str_Sample.equals("ROCKSTAR"));
System.out.println("\n'RockStar' equals('ROCKSTAR')is if Case Ignored:"+str_Sample.equalsIgnoreCase("ROCKSTAR"));

System.out.println("\n \n ######USING INDEXOF######");
System.out.println("\n indexof t in 'RockStar' is:"+str_Sample.indexOf("t"));
System.out.println("\n indexof 'Star' in 'RockStar' is:"+str_Sample.indexOf("Star"));

System.out.println("\n****Modifying  a  string****");
System.out.println("\n changing case of chaacters in the string");
System.out.println("\n All caps 'RockStar': "+str_Sample.toUpperCase());
System.out.println("\n All small 'RockStar':"+str_Sample.toLowerCase());

System.out.println("\n \n  ######USING REPLACE######");
System.out.println("\n In 'RockStar' replace 'Star' with 'et' "+str_Sample.replace("Star","et"));
}
}