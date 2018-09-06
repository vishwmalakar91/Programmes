class calc
{

void add()
{
int i=10;
int j=20;
int k=i+j;
System.out.println("add method :"+k);
}

void addi(int i,int j)
{
int k=i+j;
System.out.println("add method :"+k);
}

int addr(int i,int j)
{
int k=i+j;
//System.out.println("add method :"+k);
return k;
}





public static void main(String[]args)
{
calc c=new calc();
c.add();
c.addi(20,11);
c.addr(20,12);//will not print
int sum=c.add();
//int sum=c.addr(20,13);
System.out.println("return m :"+sum);
sum=sum+100;
System.out.println("after :"+sum);
}


}