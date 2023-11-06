import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lion = Animal("Лев", R.drawable.lion, "Це лев")
        val elephant = Elephant("Слон", R.drawable.elephant, "Це слон")
        val giraffe = Giraffe("Жираф", R.drawable.giraffe, "Це жираф")


        lionImageView.setImageResource(lion.imageResId)
        lionNameTextView.text = lion.name
        lionDescriptionTextView.text = lion.description

        viewDetailsButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("animal", lion) // Передача даних про тварину в інше Activity
            startActivity(intent)
        }
    }
}
