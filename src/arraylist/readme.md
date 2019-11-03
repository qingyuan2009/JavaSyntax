# ArrayList
使用泛型： <T> 指定传入的类型; 这样定义之后，这个ArrayList只能接收String的对象 
ArrayList<String> array = new ArrayList<String>();

以前没有加这个，传入的都是Object类型的，取出来的时候要强制类型转换为自己想要的类型。现在这样就不用强制类型转换了
