package com.company;

public class CoinCase {
    public int Y500 = 0;
    public int Y100 = 0;
    public int Y50 = 0;
    public int Y10 = 0;
    public int Y5 = 0;
    public int Y1 = 0;

    public void AddCoins( int coin, int count )
    { switch(coin)
        {   case 500:
                Y500 += count; break;
            case 100:
                Y100 += count; break;
            case 50:
                Y50 += count; break;
            case 10:
                Y10 += count; break;
            case 5:
                Y5 += count; break;
            case 1:
                Y1 += count; break;
        }
    }

    public int GetCount( int coin )
    { switch( coin )
        {   case 500: return Y500;
            case 100: return Y100;
            case 50:  return Y50;
            case 10:  return Y10;
            case 5:   return Y5;
            case 1:   return Y1;
        }
        return 0;
    }
    public int GetAmount()
    { return (Y500 * 500)+(Y100 * 100)+(Y50 * 50)+(Y10 * 10)+(Y5*5)+Y1;}

}



