import java.util.Random;

public class Paso3 {
    private int Tablero[][];                                                        // Tablero de ajedre representado en una matriz
    private static int horizontal[] = new int[] {  2,  1, -1, -2, -2, -1, 1, 2 };                       // Movimientos posibles de manera horizonta
    private static int vertical[] = new int[]      { -1, -2, -2, -1,  1,  2, 2, 1 };                        // Movimientos posibles de manera vertical
    private int movimientos;                                                        // Movimientos realizados
    private boolean aux_mov;                                                        // Auxiliar de prueba
    private int prueba;                                                         // Variable para probar todos los movimientos
    private boolean auxiliar;                                                       // Auxiliar para saber si se soluciono el problema
    private int siguiente_mov;                                                      // Siguiente movimiento que hara el caballo
    private int errores;                                                            // Se asegura que el caballo no este atrapado
    private Random rand;                                                        // Numero aleatorio
    private boolean auxiliar_ex;
    private boolean auxiliar_listo;
    private int numero;

    public  Paso3() {
        this.Tablero = new int[8][8];
        rand = new Random(System.nanoTime());
        construir_array();
    }
    

    public int [][] start(int posicionH, int posicionV) {
        do
            auxiliar_listo =  recorrido_completo(posicionH, posicionV);
        while (auxiliar_listo == false);
        return Tablero;
    }
    
    private  boolean recorrido_completo(int posicionH, int posicionV) {
        
        auxiliar = true;
        for (movimientos = 1, errores = 0; movimientos <= 64 && auxiliar; movimientos++)   
        {
            aux_mov = true;
            siguiente_mov = rand.nextInt(8);                                        
            for (prueba = 0; prueba < 8 && aux_mov; prueba++, siguiente_mov++, errores++)
            {
                
                if (siguiente_mov == 8)                                         
                    siguiente_mov = 0;
                
                try 
                {
                    if (Tablero[posicionH + horizontal[siguiente_mov]][posicionV + vertical[siguiente_mov]] == 0)
                    {
                        Tablero[posicionH][posicionV] = movimientos;
                        
                        errores = 0;
                        aux_mov = false;
                        posicionV += vertical[siguiente_mov] ;
                        posicionH += horizontal[siguiente_mov] ;
                    }
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    
                }
            }
            
            if (errores >= 8)                                                   
                auxiliar =false;
        }
        
        return movimientos >= 64;                                               
    }
    
    private void construir_array() {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                Tablero[i][j] = 0;
            }
        }
    }
}