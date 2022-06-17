package ss8_CleanCode_Refactoring.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int pointsOfPlayer1, int pointsOfPlayer2) {
        String score = "";
        int tempScore=0;
        if (pointsOfPlayer1==pointsOfPlayer2)
        {
            switch (pointsOfPlayer1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (pointsOfPlayer1>=4 || pointsOfPlayer2>=4)
        {
            int minusResult = pointsOfPlayer1-pointsOfPlayer2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = pointsOfPlayer1;
                else { score+="-"; tempScore = pointsOfPlayer2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
