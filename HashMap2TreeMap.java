import java.util.*;
import java.util.stream.*;
public class HashMap2TreeMap
{
public static <K, V> Map<K, V> convertToTreeMap (Map<K, V> hashMap )
{
Map<K, V>
treeMap = hashMap;
return treeMap;
}
public static void main(String args[])
{
Map<String ,String>hashMap = new HashMap<>();
hashMap.put("1","One") ;
hashMap.put("2","two") ;
hashMap.put("3","three") ;
System.out.println("HashMap : " + hashMap ) ;
Map<String,String>treeMap = convertToTreeMap(hashMap ) ;
System.out.println("TreeMap :" + treeMap ) ;
}
}
