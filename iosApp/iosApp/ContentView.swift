import SwiftUI
import shared

struct ContentView: View {
    let todos = TodoRepositoryImpl().getAllTodos()
    
	var body: some View {
        NavigationView {
            VStack(spacing: 8) {
            ForEach(todos, id: \.self){ todo in
                VStack {
                    Text(todo.description_)
                        .font(.headline)
                        .padding(.top)
                        .padding(.leading)
                        .frame(maxWidth: .infinity,
                               alignment: .leading)
                    Text(todo.text)
                        .font(.subheadline)
                        .padding(.leading)
                        .frame(maxWidth: .infinity,
                               alignment: .leading)
                }
            }
            Spacer()
        }.navigationBarTitle("Todos")
        .toolbar {
                    
                                Button(action: {
                                    // Add button pressed
                                }) {
                                    Image(systemName: "plus.circle.fill")
                                }
        }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
