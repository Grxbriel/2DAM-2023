//
//  ContentView.swift
//  prueba1
//
//  Created by Gabriel Ortiz Severino on 29/9/23.
//

import SwiftUI

struct MyApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}

struct ContentView: View {
    var body: some View {
        VStack {
            Text("¡Bienvenido a mi aplicación!")
                .font(.largeTitle)
                .padding()
            
            Button(action: {
                // Acciones a realizar cuando se presione el botón
            }) {
                Text("Presionar")
                    .font(.headline)
                    .padding()
                    .background(Color.blue)
                    .foregroundColor(.white)
                    .cornerRadius(10)
            }
            
            Image("nombreDeTuImagen")
                .resizable()
                .frame(width: 150, height: 150)
        }
    }
}

#Preview {
    ContentView()
}
