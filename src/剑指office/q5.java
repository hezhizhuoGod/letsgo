package 剑指office;

public class q5 {
    public String replaceSpace(String s) {
    //方法一利用函数
//        return  s.replaceAll(" ","%20");
    //方法二在Java中string 是不可变的，要改变他就要设新的数组
        StringBuffer sb=new StringBuffer();
        for(char c:s.toCharArray())
        {
            if(c==' ') {
                sb.append("%20");
            }
            else
            {
                sb.append(c);
            }
            }
        return sb.toString();
    }
}
