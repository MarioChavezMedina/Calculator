package e.requiem.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var operation:String = ""

    fun getText(view: View){
        val a = (view as Button).text.toString()
        operation = StringBuilder().append(operation).append(a).toString()

        when(operation[operation.length-1]){
            in "+" -> {}
            in "-" -> {}
            in "/" -> {}
            in "X" -> {}
            in "=" -> {}
        }


        val myToast = Toast.makeText(this, operation, Toast.LENGTH_SHORT)
        myToast.show()
    }

}
