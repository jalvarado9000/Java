public class PassFailExam extends PassFailActivity
{
    private int numQuestions; // Number of questions
    private double pointsEach; // Points for each question
    private int numMissed; // Number of questions missed

    public PassFailExam(int questions, int missed,double minPassing)
    {
        // Call the superclass constructor.
        super(minPassing);

        double numericScore;
        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    public double getPointsEach()
    {
        return pointsEach;
    }

    public int getNumMissed()
    {
        return numMissed;
    }
}