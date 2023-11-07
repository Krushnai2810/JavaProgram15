
//Java Program to Remove Duplicate Elements From the Array.

c
void display(int arr[])
{
for(int i=0; i<arr.length; i++)
{
System.out.print(arr[i]+ "  ");
}
System.out.println();
}

int[] sort_array(int arr[])
{
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
return arr;
}


int[] remove_duplicate(int arr[])
{
int count=0;
for(int i=0;i<arr.length-1;i++)
{
if(arr[i]!=arr[i+1])
{
arr[count]=arr[i];
count++;
}
}

arr[count]=arr[arr.length-1];
count++;
int arr2[]=new int[count];
for(int i=0;i<count;i++)
{
arr2[i]=arr[i];
}
return arr2;
}

public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter the elements of array ");
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
System.out.println("elements of  an array ");
demo6 ob=new demo6();
ob.display(arr);
System.out.println("elements of an array after the sorting....");
arr=ob.sort_array(arr);
ob.display(arr);
System.out.println("elements of an array after removing duplicate....");
int arr2[]=ob.remove_duplicate(arr);
ob.display(arr2);
}
}