import java.util.Random;

public class Paso2 {

    public static int[][] escribirPosicion(int pos[], int mov1, int mov2, int tablero[][], int i) {
        tablero[pos[0]+mov1 ][pos[1]+mov2]=1;
        return tablero;
    }

    public static void main(String[] args) {
        int movimientos[][] =new int[8][2];
        movimientos[0][0]=2;
        movimientos[0][1]=-1;
        movimientos[1][0]=1;
        movimientos[1][1]=-2;
        movimientos[2][0]=-1;
        movimientos[2][1]=-2;
        movimientos[3][0]=-2;
        movimientos[3][1]=-1;
        movimientos[4][0]=-2;
        movimientos[4][1]=1;
        movimientos[5][0]=-1;
        movimientos[5][1]=2;
        movimientos[6][0]=1;
        movimientos[6][1]=2;
        movimientos[7][0]=2;
        movimientos[7][1]=1;
        Random rand=new Random();
        int posInicial[] = new int[2];
        posInicial[0]=rand.nextInt(7);
        posInicial[1]=rand.nextInt(7);
        int tablero[][] = new int[8][8];
        int puntero[]=new int[2];puntero=posInicial;
        boolean completo=false;
        
        while(!completo)
        {
            for(int j=0;j<63;j++)
            {
                for(int i=0;i<=7;i++){
                try{

                    int m1=movimientos[i][0];
                    int m2=movimientos[i][1];
                    System.out.println(escribirPosicion(puntero,m1,m2,tablero,i));
                }
                catch(Exception e)
                {
                    continue;
                }
                }

            }
            for(int n=0;n<7;n++)
            {
                for(int m=0;m<8;m++)
                {
                    System.out.print(tablero[n][m]+" ");
                    if (tablero[n][m]!=0)
                    {
                        completo=true;
                    }
                    else
                    {
                        completo=false;
                        break;
                    }
                }
                System.out.println();
            }
        }
    }
}

