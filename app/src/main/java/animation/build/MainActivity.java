package animation.build;

import android.app.Activity;
import android.os.Bundle;

import animation.library.Shimmer;
import animation.library.ShimmerButton;
import animation.library.ShimmerTextView;
import animation.library.Titanic;
import animation.library.TitanicButton;
import animation.library.TitanicTextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShimmerButton shimmerButton =
                findViewById(R.id.shimmerButton);

        TitanicButton titanicButton =
                findViewById(R.id.titanicButton);

        ShimmerTextView shimmerTextView =
                findViewById(R.id.shimmerTextView);

        TitanicTextView titanicTextView =
                findViewById(R.id.titanicTextView);

        // Shimmer animations
        new Shimmer()
                .setDuration(1500)
                .start(shimmerButton);

        new Shimmer()
                .setDuration(1500)
                .start(shimmerTextView);

        // Titanic animations
        new Titanic().start(titanicButton);
        new Titanic().start(titanicTextView);
    }
}
