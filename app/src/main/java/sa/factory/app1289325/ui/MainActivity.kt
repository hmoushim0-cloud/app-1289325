package sa.factory.app1289325.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import sa.factory.app1289325.data.InMemoryOrderRequestRepository

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = InMemoryOrderRequestRepository()
        val viewModel = OrderRequestViewModel(repository)
        setContent {
            OrderRequestMainScreen(
                viewModel = viewModel,
                onNavigateDetails = {}
            )
        }
    }
}
