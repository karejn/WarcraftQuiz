package com.example.ekzhu.warcraftquiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    // User Answers
    boolean answerOne, answerTwo, answerThreeOne, answerThreeTwo, answerFour, answerFiveOne,
            answerFiveTwo, answerSix, answerSeven, answerEight, answerNine, answerTen;

    // Score counter variables
    String toast;
    int score;

    // saving instances
    static final String playerAnswerOne = "Players Score 1";
    static final String playerAnswerTwo = "Players Score 2";
    static final String playerAnswerThreeOne = "Players Score 2";
    static final String playerAnswerThreeTwo = "Players Score 3";
    static final String playerAnswerFour = "Players Score 4";
    static final String playerAnswerFiveOne = "Players Score 4";
    static final String playerAnswerFiveTwo = "Players Score 5";
    static final String playerAnswerSix = "Players Score 6";
    static final String playerAnswerSeven = "Players Score 7";
    static final String playerAnswerEight = "Players Score 8";
    static final String playerAnswerNine = "Players Score 9";
    static final String playerAnswerTen = "Players Score 10";

    // Enter variables
    EditText input4, input8;
    CheckBox answer3_1, answer3_2, answer3_3, answer3_4, answer5_1, answer5_2, answer5_3, answer5_4;
    RadioButton answer1, answer2, answer6, answer7, answer9, answer10;
    RadioGroup answer1group, answer2group, answer6group, answer7group, answer9group, answer10group;
    ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            answerOne = savedInstanceState.getBoolean(playerAnswerOne);
            answerTwo = savedInstanceState.getBoolean(playerAnswerTwo);
            answerThreeOne = savedInstanceState.getBoolean(playerAnswerThreeOne);
            answerThreeTwo = savedInstanceState.getBoolean(playerAnswerThreeTwo);
            answerFour = savedInstanceState.getBoolean(playerAnswerFour);
            answerFiveOne = savedInstanceState.getBoolean(playerAnswerFiveOne);
            answerFiveTwo = savedInstanceState.getBoolean(playerAnswerFiveTwo);
            answerSix = savedInstanceState.getBoolean(playerAnswerSix);
            answerSeven = savedInstanceState.getBoolean(playerAnswerSeven);
            answerEight = savedInstanceState.getBoolean(playerAnswerEight);
            answerNine = savedInstanceState.getBoolean(playerAnswerNine);
            answerTen = savedInstanceState.getBoolean(playerAnswerTen);
        }
        input4 = (EditText) findViewById(R.id.Q4A);
        input8 = (EditText) findViewById(R.id.Q8A);
        answer3_1 = (CheckBox) findViewById(R.id.Q3A1);
        answer3_2 = (CheckBox) findViewById(R.id.Q3A2);
        answer3_3 = (CheckBox) findViewById(R.id.Q3A3);
        answer3_4 = (CheckBox) findViewById(R.id.Q3A4);
        answer5_1 = (CheckBox) findViewById(R.id.Q5A1);
        answer5_2 = (CheckBox) findViewById(R.id.Q5A2);
        answer5_3 = (CheckBox) findViewById(R.id.Q5A3);
        answer5_4 = (CheckBox) findViewById(R.id.Q5A4);
        answer1 = (RadioButton) findViewById(R.id.Q1A4);
        answer2 = (RadioButton) findViewById(R.id.Q2A3);
        answer6 = (RadioButton) findViewById(R.id.Q6A2);
        answer7 = (RadioButton) findViewById(R.id.Q7A1);
        answer9 = (RadioButton) findViewById(R.id.Q9A3);
        answer10 = (RadioButton) findViewById(R.id.Q10A2);
        answer1group = (RadioGroup) findViewById(R.id.Q1);
        answer2group = (RadioGroup) findViewById(R.id.Q2);
        answer6group = (RadioGroup) findViewById(R.id.Q6);
        answer7group = (RadioGroup) findViewById(R.id.Q7);
        answer9group = (RadioGroup) findViewById(R.id.Q9);
        answer10group = (RadioGroup) findViewById(R.id.Q10);
        scroll = (ScrollView) findViewById(R.id.scroll_view_id);

    }

    //onSaveInstance
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putBoolean(playerAnswerOne, answerOne);
        savedInstanceState.putBoolean(playerAnswerTwo, answerTwo);
        savedInstanceState.putBoolean(playerAnswerThreeOne, answerThreeOne);
        savedInstanceState.putBoolean(playerAnswerThreeTwo, answerThreeTwo);
        savedInstanceState.putBoolean(playerAnswerFour, answerFour);
        savedInstanceState.putBoolean(playerAnswerFiveOne, answerFiveOne);
        savedInstanceState.putBoolean(playerAnswerFiveTwo, answerFiveTwo);
        savedInstanceState.putBoolean(playerAnswerSix, answerSix);
        savedInstanceState.putBoolean(playerAnswerSeven, answerSeven);
        savedInstanceState.putBoolean(playerAnswerEight, answerEight);
        savedInstanceState.putBoolean(playerAnswerNine, answerNine);
        savedInstanceState.putBoolean(playerAnswerTen, answerTen);

        super.onSaveInstanceState(savedInstanceState);
    }

    //Retrieves 4. answer entered value

    public String addonName() {
        String name = input4.getText().toString();
        return name;
    }

    //Retrieves 8. answer entered value
    public String bossName() {
        String name = input8.getText().toString();
        return name;
    }

    //Retrieves other answer entered values
    public void isClicked(View view) {
        answerThreeOne = answer3_1.isChecked();
        answerThreeTwo = answer3_3.isChecked();
        answerFiveOne = answer5_1.isChecked();
        answerFiveTwo = answer5_2.isChecked();
        answerOne = answer1.isChecked();
        answerTwo = answer2.isChecked();
        answerSix = answer6.isChecked();
        answerSeven = answer7.isChecked();
        answerNine = answer9.isChecked();
        answerTen = answer10.isChecked();
    }

    //Counts the final score
    public int scoreCounter() {
        score = 0;

        // Checks the 1. answer if entered correctly and adds points if true
        if (answerOne) {
            score = score + 1;
        }

        // Checks the 2. answer if entered correctly and adds points if true
        if (answerTwo) {
            score = score + 1;
        }

        // Checks the 3. answer if entered correctly and adds points if true
        if (answerThreeOne && answerThreeTwo) {
            score++;
        }


        // Checks the 4. answer if entered correctly and adds points if true
        answerFour = addonName().equalsIgnoreCase(getString(R.string.question_four_answer));
        if (answerFour) {
            score = score + 1;
        }

        // Checks the 5. answer if entered correctly and adds points if true
        if (answerFiveOne && answerFiveTwo) {
            score++;
        }

        // Checks the 6. answer if entered correctly and adds points if true
        if (answerSix) {
            score = score + 1;
        }

        // Checks the 7. answer if entered correctly and adds points if true
        if (answerSeven) {
            score = score + 1;
        }

        // Checks the 8. answer if entered correctly and adds points if true
        answerEight = bossName().equalsIgnoreCase(getString(R.string.question_eight_answer));
        if (answerEight) {
            score = score + 1;
        }

        // Checks the 9. answer if entered correctly and adds points if true
        if (answerNine) {
            score = score + 1;
        }

        // Checks the 10. answer if entered correctly and adds points if true
        if (answerTen) {
            score = score + 1;
        }
        return score;
    }

    //Creates a congratulations message
    public String finalMessage(int score) {
        toast = getString(R.string.congratulations);
        toast = toast + "\n" + getString(R.string.final_score) + " " + score + getString(R.string.max_score);
        return toast;
    }


    //Displays a toast with congratulations message or Error message if user did not answer to all questions
    public void displayResults(View view) {
        if ((questionOneEmpty() || questionTwoEmpty() || questionThreeEmpty() || questionFourEmpty() ||
                questionFiveEmpty() || questionSixEmpty() || questionSevenEmpty() || questionEightEmpty() ||
                questionNineEmpty() || questionTenEmpty())) {
            displayToast(errorMessage());
        } else if (questionThreeNumberOfAnswers()) {
            displayToast(getString(R.string.question_3_error));
        } else if (questionFiveNumberOfAnswers()) {
            displayToast(getString(R.string.question_5_error));
        } else {
            displayToast(finalMessage(scoreCounter()));
        }
    }


    /*
    Displays toast message
    @toastText is a String value that is going to be displayed in toast message
     */
    private void displayToast(String toastText) {
        Context context = getApplicationContext();
        CharSequence text = toastText;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //Rest
    public void scoreReset(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        score = 0;
        input4.setText(null);
        input8.setText(null);
        answer3_1.setChecked(false);
        answer3_2.setChecked(false);
        answer3_3.setChecked(false);
        answer3_4.setChecked(false);
        answer5_1.setChecked(false);
        answer5_2.setChecked(false);
        answer5_3.setChecked(false);
        answer5_4.setChecked(false);
        answer2group.clearCheck();
        answer1group.clearCheck();
        answer7group.clearCheck();
        answer6group.clearCheck();
        answer9group.clearCheck();
        answer10group.clearCheck();
        scroll.fullScroll(ScrollView.FOCUS_UP);
    }

    //Checks if question 1 is not left blank
    private boolean questionOneEmpty() {
        if (answer1group.getCheckedRadioButtonId() == -1) {
            return true;
        }
        return false;
    }

    //Checks if question 2 is not left blank
    private boolean questionTwoEmpty() {
        if (answer2group.getCheckedRadioButtonId() == -1) {
            return true;
        }
        return false;
    }

    //Checks if question 3 is not left blank
    private boolean questionThreeEmpty() {
        if (!(answer3_1.isChecked() || answer3_2.isChecked() || answer3_3.isChecked() || answer3_4.isChecked())) {
            return true;
        }
        return false;
    }

    //Checks if question 4 is not left blank
    private boolean questionFourEmpty() {
        if (TextUtils.isEmpty(addonName())) {
            return true;
        }
        return false;
    }

    //Checks if question 5 is not left blank
    private boolean questionFiveEmpty() {
        if (!(answer5_1.isChecked() || answer5_2.isChecked() || answer5_3.isChecked() || answer5_4.isChecked())) {
            return true;
        }
        return false;
    }

    //Checks if question 6 is not left blank
    private boolean questionSixEmpty() {
        if (answer6group.getCheckedRadioButtonId() == -1) {
            return true;
        }
        return false;
    }

    //Checks if question 7 is not left blank
    private boolean questionSevenEmpty() {
        if (answer7group.getCheckedRadioButtonId() == -1) {
            return true;
        }
        return false;
    }

    //Checks if question 8 is not left blank
    private boolean questionEightEmpty() {
        if (TextUtils.isEmpty(bossName())) {
            return true;
        }
        return false;
    }

    //Checks if question 9 is not left blank
    private boolean questionNineEmpty() {
        if (answer9group.getCheckedRadioButtonId() == -1) {
            return true;
        }
        return false;
    }

    //Checks if question 10 is not left blank
    private boolean questionTenEmpty() {
        if (answer10group.getCheckedRadioButtonId() == -1) {
            return true;
        }
        return false;
    }

    //Creates toast error message if any answer left blank
    private String errorMessage() {
        toast = null;
        if (questionOneEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_1);
            } else {
                toast = getString(R.string.empty_answer_1);
            }
        }
        if (questionTwoEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_2);
            } else {
                toast = getString(R.string.empty_answer_2);
            }
        }
        if (questionThreeEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_3);
            } else {
                toast = getString(R.string.empty_answer_3);
            }
        }
        if (questionFourEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_4);
            } else {
                toast = getString(R.string.empty_answer_4);
            }
        }
        if (questionFiveEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_5);
            } else {
                toast = getString(R.string.empty_answer_5);
            }
        }
        if (questionSixEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_6);
            } else {
                toast = getString(R.string.empty_answer_6);
            }
        }
        if (questionSevenEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_7);
            } else {
                toast = getString(R.string.empty_answer_7);
            }
        }
        if (questionEightEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_8);
            } else {
                toast = getString(R.string.empty_answer_8);
            }
        }
        if (questionNineEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_9);
            } else {
                toast = getString(R.string.empty_answer_9);
            }
        }
        if (questionTenEmpty()) {
            if (toast != null) {
                toast = toast + "\n" + getString(R.string.empty_answer_10);
            } else {
                toast = getString(R.string.empty_answer_10);
            }
        }

        return toast;
    }

    //Checks how many answers in question 3 are marked
    private boolean questionThreeNumberOfAnswers() {
        int numberofAnswers = 0;
        if (answer3_1.isChecked()) {
            numberofAnswers++;
        }
        if (answer3_2.isChecked()) {
            numberofAnswers++;
        }
        if (answer3_3.isChecked()) {
            numberofAnswers++;
        }
        if (answer3_4.isChecked()) {
            numberofAnswers++;
        }
        if (numberofAnswers > 2) {
            return true;
        }
        return false;
    }

    //Checks how many answers in question 5 are marked
    private boolean questionFiveNumberOfAnswers() {
        int numberofAnswers = 0;
        if (answer5_1.isChecked()) {
            numberofAnswers++;
        }
        if (answer5_2.isChecked()) {
            numberofAnswers++;
        }
        if (answer5_3.isChecked()) {
            numberofAnswers++;
        }
        if (answer5_4.isChecked()) {
            numberofAnswers++;
        }
        if (numberofAnswers > 2) {
            return true;
        }
        return false;
    }
}
