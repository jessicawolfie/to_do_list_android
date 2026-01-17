# 📱 To-Do List - Android

A minimalist Android app to manage your daily tasks simply and efficiently.

## 📋 About the Project

This is a to-do list app developed in Kotlin, with a minimalist design in shades of black, white, and gray. The app allows you to add, view, and remove tasks, with data persistence so your tasks are saved even after closing the app.

## ✨ Features

- ✅ **Add tasks** - Intuitive interface with text field and add button
- 👁️ **View tasks** - Organized list of all your tasks
- 🗑️ **Remove tasks** - Delete button next to each task
- 💾 **Data persistence** - Your tasks are automatically saved using SharedPreferences
- 🎨 **Minimalist design** - Clean interface in shades of gray, black, and white
- ✔️ **Validation** - Prevents adding empty tasks

## 🛠️ Technologies Used

- **Kotlin** - Main language
- **RecyclerView** - Efficient task list
- **ViewBinding** - Safe view binding
- **SharedPreferences** - Local storage
- **Gson** - Data serialization
- **Material Design** - UI components


## 🚀 How to Run

### Prerequisites

- Android Studio (latest version)
- JDK 8 or higher
- Android device (API 24+) or Emulator

### Steps

1. Clone the repository
```bash
git clone https://github.com/your-username/todo-list-android.git
```

2. Open the project in Android Studio

3. Wait for Gradle to sync dependencies

4. Run the app on emulator or physical device

## 📦 Project Structure

```
app/
├── src/main/
│   ├── java/com/example/todolist/
│   │   ├── MainActivity.kt          # Main activity
│   │   ├── Task.kt                  # Data model
│   │   └── TaskAdapter.kt           # RecyclerView adapter
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml    # Main layout
│   │   │   └── item_task.xml        # List item layout
│   │   ├── drawable/                # Visual resources
│   │   └── values/                  # Themes and styles
│   └── AndroidManifest.xml
```

## 🎨 Design

The app follows a minimalist design with:
- Clean white background
- Black buttons with press effect
- Light gray task items
- Rounded borders and subtle shadows
- Modern sans-serif typography

## 🧪 Technical Features

- **ViewBinding** for safe view access
- **RecyclerView** with ViewHolder pattern for performance
- **SharedPreferences** with JSON serialization (Gson) for persistence
- **Toast messages** for user feedback
- **Input validation** to prevent empty tasks

## 📝 License

This project is under the MIT license. See the LICENSE file for more details.

## 👨‍💻 Author

Developed by Jessica Cafezeiro



---

# 📱 Lista de Tarefas - Android

Um aplicativo Android minimalista para gerenciar suas tarefas diárias de forma simples e eficiente.

## 📋 Sobre o Projeto

Este é um aplicativo de lista de tarefas desenvolvido em Kotlin, com design minimalista em tons de preto, branco e cinza. O app permite adicionar, visualizar e remover tarefas, com persistência de dados para que suas tarefas sejam salvas mesmo após fechar o aplicativo.

## ✨ Funcionalidades

- ✅ **Adicionar tarefas** - Interface intuitiva com campo de texto e botão de adicionar
- 👁️ **Visualizar tarefas** - Lista organizada de todas as suas tarefas
- 🗑️ **Remover tarefas** - Botão de exclusão ao lado de cada tarefa
- 💾 **Persistência de dados** - Suas tarefas são salvas automaticamente usando SharedPreferences
- 🎨 **Design minimalista** - Interface clean em tons de cinza, preto e branco
- ✔️ **Validação** - Não permite adicionar tarefas vazias

## 🛠️ Tecnologias Utilizadas

- **Kotlin** - Linguagem principal
- **RecyclerView** - Lista eficiente de tarefas
- **ViewBinding** - Binding seguro de views
- **SharedPreferences** - Armazenamento local
- **Gson** - Serialização de dados
- **Material Design** - Componentes de interface


## 🚀 Como Executar

### Pré-requisitos

- Android Studio (versão mais recente)
- JDK 8 ou superior
- Dispositivo Android (API 24+) ou Emulador

### Passos

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/todo-list-android.git
```

2. Abra o projeto no Android Studio

3. Aguarde o Gradle sincronizar as dependências

4. Execute o app no emulador ou dispositivo físico

## 📦 Estrutura do Projeto

```
app/
├── src/main/
│   ├── java/com/example/todolist/
│   │   ├── MainActivity.kt          # Activity principal
│   │   ├── Task.kt                  # Modelo de dados
│   │   └── TaskAdapter.kt           # Adapter do RecyclerView
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml    # Layout principal
│   │   │   └── item_task.xml        # Layout do item da lista
│   │   ├── drawable/                # Recursos visuais
│   │   └── values/                  # Temas e estilos
│   └── AndroidManifest.xml
```

## 🎨 Design

O aplicativo segue um design minimalista com:
- Fundo branco limpo
- Botões em preto com efeito de pressão
- Itens de tarefa em cinza claro
- Bordas arredondadas e sombras sutis
- Tipografia sans-serif moderna

## 🧪 Funcionalidades Técnicas

- **ViewBinding** para acesso seguro às views
- **RecyclerView** com ViewHolder pattern para performance
- **SharedPreferences** com serialização JSON (Gson) para persistência
- **Toast messages** para feedback ao usuário
- **Validação de entrada** para prevenir tarefas vazias


## 👨‍💻 Autor

Desenvolvido por Jessica Cafezeiro.

---

⭐ Se você gostou deste projeto, não esqueça de dar uma estrela!
