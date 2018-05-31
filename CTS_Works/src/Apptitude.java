
public class Apptitude 
{
	public static void main(String[] args) {
	float i,j,k,l;

	for( i=0;i<14;i++)
		for(j=0;j<14;j++)
			for( k=0;k<14;k++)
				for( l=0;l<14;l++)
					if((i+j==8)&&(k-l==6)&&(i+k==13)&&(j+l==8))
					{
						System.out.print(i);
						System.out.print(j);
						System.out.print(k);
						System.out.print(l);
					}
	}

}
