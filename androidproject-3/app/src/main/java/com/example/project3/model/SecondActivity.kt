import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val animal = intent.getParcelableExtra<Animal>("animal")

        animalImageView.setImageResource(animal?.imageResId ?: 0)
        animalNameTextView.text = animal?.name
        animalDescriptionTextView.text = animal?.description
    }
}
