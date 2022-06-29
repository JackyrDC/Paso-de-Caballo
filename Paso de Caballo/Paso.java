import java.util.Random;

public class Paso{

    public static void main(String args[]){
        int[][] tablero= new [8][8] int;
        int [2] mov0= {2,-1};
        int [2] mov1= {1,-2};
        int [2] mov2= {-1,-2};
        int [2] mov3= {-2,-1};
        int [2] mov4= {-2,1};
        int [2] mov5= {-1,2};
        int [2] mov6= {1,2};
        int [2] mov7= {2,1};
        Random rand=new Random();

        int inicio1=rand.nextInt(7);
        int inicio2=rand.nextInt(7);

        tablero[inicio1][inicio2]=1;

        for(int i=2;i<63;i++){
            try{
                tablero[mov0[0]][mov0[1]]=i
            }
            catch
            {
                tablero[mov1[0]][mov1[1]]=i
            }
        }
        for(int n=0;n<7;n++)
        {
            for(int j=0; j<7;j++)
            {
                System.out.print(tablero[n][j]);
            }
            System.out.print("\n");
        }

    }
}