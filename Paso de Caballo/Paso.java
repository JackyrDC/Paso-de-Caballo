import java.util.Random;

public class Paso{

    public static void main(String args[]){
        int tablero[][] = new int[8][8];
        int mov0 []= {2,-1};
        int mov1[]= {1,-2};
        int mov2[]= {-1,-2};
        int mov3[]= {-2,-1};
        int mov4[]= {-2,1};
        int mov5[]= {-1,2};
        int mov6[]= {1,2};
        int mov7[]= {2,1};
        Random rand=new Random();

        int inicio1=rand.nextInt(7);
        int inicio2=rand.nextInt(7);

        tablero[inicio1][inicio2]=1;
        int puntero[]={inicio1,inicio2};

        for(int i=2;i<63;i++){
            try{
                if(tablero[puntero[0]+ mov0[0]][puntero[1]+mov0[1]]==0)
                {
                    try{
                    tablero[puntero[0]+ mov0[0]][puntero[1]+mov0[1]]=i;
                    puntero[0]=puntero[0]+mov0[0];
                    puntero[1]=puntero[1]+mov0[1];
                    }
                    catch(Exception e)
                    {
                        System.out.println("No se puede mover debido a "+ e.toString());
                    }
                    continue;
                }
                else if(tablero[puntero[0]+ mov1[0]][puntero[1]+mov1[1]]==0)
                {
                    try{
                    tablero[puntero[0]+ mov1[0]][puntero[1]+mov1[1]]=i;
                    puntero[0]=puntero[0]+mov1[0];
                    puntero[1]=puntero[1]+mov1[1];
                }
                catch(Exception e)
                {
                    System.out.println("No se puede mover debido a "+ e.toString());
                }
                continue;
                }
                else if(tablero[puntero[0]+ mov2[0]][puntero[1]+mov2[1]]==0)
                {
                 try{
                    tablero[puntero[0]+ mov2[0]][puntero[1]+mov2[1]]=i;
                    puntero[0]=puntero[0]+mov2[0];
                    puntero[1]=puntero[1]+mov2[1];
                }
                    catch(Exception e)
                    {
                        System.out.println("No se puede mover debido a "+ e.toString());
                    }
                    continue;
                }
                else if(tablero[puntero[0]+ mov3[0]][puntero[1]+mov3[1]]==0)
                {
                    try{
                    tablero[puntero[0]+ mov3[0]][puntero[1]+mov3[1]]=i;
                    puntero[0]=puntero[0]+mov3[0];
                    puntero[1]=puntero[1]+mov3[1];
                    }
                    catch(Exception e)
                    {
                        System.out.println("No se puede mover debido a "+ e.toString());
                    }
                    continue;
                }
                else if(tablero[puntero[0]+ mov4[0]][puntero[1]+mov4[1]]==0)
                {
                    try{
                    tablero[puntero[0]+ mov4[0]][puntero[1]+mov4[1]]=i;
                    puntero[0]=puntero[0]+mov4[0];
                    puntero[1]=puntero[1]+mov4[1];
                    }
                    catch(Exception e)
                    {
                        System.out.println("No se puede mover debido a "+ e.toString());
                    }
                    continue;
                }
                else if(tablero[puntero[0]+ mov5[0]][puntero[1]+mov5[1]]==0)
                {
                    try{
                    tablero[puntero[0]+ mov5[0]][puntero[1]+mov5[1]]=i;
                    puntero[0]=puntero[0]+mov5[0];
                    puntero[1]=puntero[1]+mov5[1];
                    }
                    catch(Exception e)
                    {
                        System.out.println("No se puede mover debido a "+ e.toString());
                    }
                    continue;
                }
                else if(tablero[puntero[0]+ mov6[0]][puntero[1]+mov6[1]]==0)
                {
                    try{
                    tablero[puntero[0]+ mov6[0]][puntero[1]+mov6[1]]=i;
                    puntero[0]=puntero[0]+mov6[0];
                    puntero[1]=puntero[1]+mov6[1];
                    }
                    catch(Exception e)
                    {
                        System.out.println("No se puede mover debido a "+ e.toString());
                    }
                    continue;
                }
                else if(tablero[puntero[0]+ mov7[0]][puntero[1]+mov7[1]]==0)
                {
                    try{
                    tablero[puntero[0]+ mov7[0]][puntero[1]+mov7[1]]=i;
                    puntero[0]=puntero[0]+mov7[0];
                    puntero[1]=puntero[1]+mov7[1];
                    }
                    catch(Exception e)
                    {
                        System.out.println("No se puede mover debido a "+ e.toString());
                    }
                    continue;
                }
                else{
                    System.out.println("No se puede mover");
                    System.out.println("Se llego a"+ String.valueOf(i)+"movimientos");
                    System.out.println("El tablero es:");
                    break;
                }
        }
        catch(Exception e)
        {
            System.out.println("No se puede mover debido a "+ e.toString());
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