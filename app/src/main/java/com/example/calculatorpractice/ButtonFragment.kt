package com.example.calculatorpractice
import android.content.Context
import android.graphics.Insets.add
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calculatorpractice.databinding.FragmentButtonBinding

import java.lang.ClassCastException



open class ButtonFragment : Fragment() {
    private lateinit var binding: FragmentButtonBinding

    //initialize entryFrag instance stuff

    var ans = ""    //string to be converted to int and displayed indirectly to
    var num1 = 0
    var num2 = 0

    var sign = ""
    var num2True = false        //if num2 = true, then calculate. only two numbers
    var numEntries =
        0      //stores number of entries for num1 and num 2, cannot add more than one number.

    var calculate = 0 //what will be calculated.
    var activityCallback: ButtonFragmentListener? = null

    interface ButtonFragmentListener {
        fun onButtonClick(answerDisplay: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            activityCallback = context as ButtonFragmentListener

        } catch (e: ClassCastException) {
            throw ClassCastException(context.toString() + "IMPLEMENT BUTTON FRAG LISTENER")
        }

    }//end of onAttach

    private fun buttonClicked(view: View) {
        activityCallback?.onButtonClick(ans)    //will pass instance of answer to entry fragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentButtonBinding.inflate(inflater, container, false)
        //numbers
        binding.btn0.setOnClickListener {
            ans += "0"

            buttonClicked(it)
        }
        binding.btn1.setOnClickListener {
            ans += "1"
            buttonClicked(it)
        }
        binding.btn2.setOnClickListener {
            ans += "2"
            buttonClicked(it)
        }
        binding.btn3.setOnClickListener {
            ans += "3"
            buttonClicked(it)
        }
        binding.btn4.setOnClickListener {
            ans += "4"
            buttonClicked(it)
        }
        binding.btn5.setOnClickListener {
            ans += "5"
            buttonClicked(it)
        }
        binding.btn6.setOnClickListener {
            ans += "6"
            buttonClicked(it)
        }
        binding.btn7.setOnClickListener {
            ans += "7"
            buttonClicked(it)
        }
        binding.btn8.setOnClickListener {
            ans += "8"
            buttonClicked(it)
        }
        binding.btn9.setOnClickListener {
            ans += "9"
            buttonClicked(it)
        }


        //operators
        binding.btnCE.setOnClickListener {
            ans = ""
            num1 = 0
            num2 = 0
            calculate = 0
            numEntries = 0
            sign = ""
            //clear everything
             buttonClicked(it)
        }//end of btnCE
        binding.btnClear.setOnClickListener {
            if (numEntries ==0) {   //this is first entry.
                num1 = 0
                ans = ""
            } else {
                num2 = 0
                ans = ""
            }
            //need to pop last entry.

             buttonClicked(it)
        }//end of btnClear
        binding.btnPlus.setOnClickListener {

                num1 = ans.toInt()
                sign = "+"
                numEntries++ //increment
                ans = ""    //blank out for next entry.
              //  num2True = true

            buttonClicked(it)
        }//end of btnPlus
        binding.btnMinus.setOnClickListener {
            num1 = ans.toInt()
            sign = "-"
            numEntries++ //increment
            ans = ""    //blank out for next entry.
            buttonClicked(it)
        }//end of btnMinus
        binding.btnMultiply.setOnClickListener {
            num1 = ans.toInt()
            sign = "x"
            numEntries++ //increment
            ans = ""    //blank out for next entry.
            buttonClicked(it)
        }//end of btnMultiply
        binding.btnDivide.setOnClickListener {
            num1 = ans.toInt()
            sign = "/"
            numEntries++ //increment
            ans = ""    //blank out for next entry.
            buttonClicked(it)
        }//end of btnDivide
        binding.btnModulus.setOnClickListener {
            num1 = ans.toInt()
            sign = "%"
            numEntries++
            ans = ""
            buttonClicked(it)
        }//end of Modulus.
        binding.btnEnter.setOnClickListener {


            if (numEntries >0)
            {
                num2 = ans.toInt()  //what is currently in
            }
            when (sign) //the operator signs.
            {
                "+" -> calculate = num1 + num2
                "-" -> calculate = num1 - num2
                "x" -> calculate = num1 * num2
                "/" -> calculate = num1 / num2
                "%" -> calculate = num1 % num2
            }//end of when switch statement.
            ans = calculate.toString()
            numEntries = 0  //restart
            sign = ""   //restart
            buttonClicked(it)
        }//end btn Enter.


        return binding.root
    }
}

