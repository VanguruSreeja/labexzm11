class NonGen{
  Object obj;
  NonGen(Object ob){
  this.obj=ob;
}
Object getObj(){
return obj;
}
void showType(){
 System.out.println("Type of obj is"+obj.getClass().getName());
}
}


public class NonGenTest{
  public static void main(String[] args){
NonGen integerObject=new NonGen(123);
integerObject.showType();
int v=(Integer)integerObject.getObj();
System.out.println(v);
NonGen stringObject=new NonGen("hello");
stringObject.showType();
String str=(String)stringObject.getObj();
System.out.println(str);
}
}