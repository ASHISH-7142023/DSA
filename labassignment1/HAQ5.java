package labassignment1;

public class HAQ5 {

	int rand=(int)(Math.random()*2);
    int count=1;
    int c=0;
    int d=0;
    int mat[][]= new int [4][4];
    int rowind[]= new int[4];
    int colind[]= new int [4];
    for(int i=0;i<mat.length;i++)
    {
        for(int j=0;j<mat.length;j++,count++)
        {
            mat[i][j]=rand;
            rand=(int)(Math.random()*2);
            System.out.print(mat[i][j]+" ");
            if(count%4==0)
            {
                System.out.println();
            }
        }
    }
    for(int i=0;i<mat.length;i++)
    {
        c=0;
        d=0;
        for(int j=0;j<mat.length;j++)
        {
            if(mat[i][j]!=0)
            {
               ++c;
            }
            if(mat[j][i]!=0)
            {
                ++d;
            }
        }
        rowind[i]=c;
        colind[i]=d;
    }
    int maxrow=rowind[0];
    int maxcol=colind[0];
    for(int i=0;i<rowind.length;i++)
    {
        if(maxrow<rowind[i])
        {
            maxrow=rowind[i];
        }
        if(maxcol<colind[i])
        {
            maxcol=colind[i];
        }
    }
    for(int i=0;i<rowind.length;i++)
    {
        if(maxrow==rowind[i])
        {
            System.out.println("row index "+i);
            break;
        }
    }
    for(int i=0;i<colind.length;i++)
    {
        if(maxcol==colind[i])
        {
            System.out.println("column index "+i);
            break;
        }
    }

    
}
}