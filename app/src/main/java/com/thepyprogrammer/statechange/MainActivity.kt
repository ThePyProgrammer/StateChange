import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.thepyprogrammer.statechange.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate method")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart method")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume method")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause method")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop method")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy method")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "ononRestoreInstanceState method")
    }

    companion object {
        private const val TAG = "State Change"
    }
}