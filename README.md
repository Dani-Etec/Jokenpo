# 🎮 Jokenpo - Pedra, Papel e Tesoura

Um aplicativo Android desenvolvido em Kotlin que implementa o clássico jogo de Pedra, Papel e Tesoura com interface intuitiva e dinâmica.

---

## 📋 Sumário
- [Visão Geral](#visão-geral)
- [Características](#características)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Como Executar](#como-executar)
- [Guia de Uso](#guia-de-uso)
- [Arquitetura do Código](#arquitetura-do-código)
- [Dependências](#dependências)
- [Configuração do Ambiente](#configuração-do-ambiente)
- [Troubleshooting](#troubleshooting)
- [Autor](#autor)

---

## 🎯 Visão Geral

**Jokenpo** é um aplicativo mobile que oferece uma experiência interativa do jogo tradicional de Pedra, Papel e Tesoura. O usuário escolhe uma das três opções (Pedra, Papel ou Tesoura) através de botões visuais e compete contra o computador, que faz uma escolha aleatória. O resultado da partida é exibido instantaneamente na tela.

### Objetivo Principal
Proporcionar um jogo divertido e responsivo onde o jogador interage através de uma interface amigável com ícones visuais representando cada movimento do jogo.

---

## ✨ Características

- ✅ **Interface Intuitiva**: Botões com ícones grandes e fáceis de usar
- ✅ **Decisão Aleatória**: O computador faz escolhas realmente aleatórias
- ✅ **Feedback Visual**: Exibe a escolha do computador e o resultado da partida
- ✅ **Design Responsivo**: Funciona em diferentes tamanhos de tela
- ✅ **Suporte a Edge-to-Edge**: Layout moderno compatível com Android 12+
- ✅ **Tema Customizado**: Interface visual limpa e agradável

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Descrição |
|-----------|--------|-----------|
| **Kotlin** | 100% do código | Linguagem de programação principal |
| **Android SDK** | 36 | Compilação e desenvolvimento |
| **API Mínima** | 24 (Android 7.0) | Compatibilidade com dispositivos antigos |
| **API Alvo** | 36 (Android 15) | Versão mais recente do Android |
| **Gradle** | 8.x | Sistema de build |
| **AndroidX** | Última versão | Bibliotecas de suporte modernizadas |
| **ConstraintLayout** | 2.x | Layout responsivo |
| **Material Design** | 3.x | Componentes de interface visual |

### Principais Bibliotecas

```kotlin
// Core AndroidX
androidx.core:core-ktx
androidx.appcompat:appcompat

// Material Design
com.google.android.material:material

// Layout
androidx.constraintlayout:constraintlayout

// Activity
androidx.activity:activity

// Testing
junit:junit
androidx.test.ext:junit
androidx.test.espresso:espresso-core
```

---

## 📁 Estrutura do Projeto

```
Jokenpo/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/br/gov/sp/jokenpo/
│   │   │   │   └── MainActivity.kt          # Atividade principal com lógica do jogo
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml    # Layout da interface
│   │   │   │   ├── drawable/                # Imagens (pedra, papel, tesoura, padrão)
│   │   │   │   ├── values/                  # Cores, strings e estilos
│   │   │   │   ├── values-night/            # Tema escuro
│   │   │   │   ├── mipmap-*/                # Ícones do aplicativo
│   │   │   │   └── xml/                     # Configurações de backup
│   │   │   └── AndroidManifest.xml          # Manifesto do aplicativo
│   │   ├── test/                            # Testes unitários
│   │   └── androidTest/                     # Testes instrumentalizados
│   └── build.gradle.kts                     # Configuração de build do app
├── gradle/                                   # Configurações do Gradle
├── build.gradle.kts                         # Configuração de build principal
├── settings.gradle.kts                      # Configurações do projeto
├── gradle.properties                        # Propriedades do Gradle
├── gradlew                                  # Gradle Wrapper (Linux/Mac)
├── gradlew.bat                              # Gradle Wrapper (Windows)
└── .gitignore                               # Arquivos ignorados pelo Git
```

### Explicação dos Componentes Principais

- **MainActivity.kt**: Contém toda a lógica do jogo, gerencia eventos de clique e determina o vencedor
- **activity_main.xml**: Define a interface visual com TextViews, ImageViews e ConstraintLayout
- **drawable/**: Armazena as imagens dos gestos (pedra, papel, tesoura) e imagem padrão
- **build.gradle.kts**: Especifica dependências e configurações de compilação

---

## 📋 Pré-requisitos

Antes de iniciar, certifique-se de ter instalado:

### Sistema Operacional
- **Windows**, **macOS** ou **Linux**

### Software Obrigatório
- ✅ **Java Development Kit (JDK)** 11 ou superior
  - Download: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
  - Verificar instalação: `java -version`

- ✅ **Android Studio** 2023.1 ou superior
  - Download: https://developer.android.com/studio
  - Inclui SDK, emulador e todas as ferramentas necessárias

### Configuração Recomendada
- **RAM**: Mínimo 8 GB
- **Espaço em Disco**: Mínimo 10 GB
- **Conexão de Internet**: Para download das dependências

### Variáveis de Ambiente
```bash
# Adicione ao PATH do seu sistema:
JAVA_HOME = /caminho/para/jdk-11
ANDROID_HOME = /caminho/para/android-sdk
```

---

## 🚀 Instalação

### Método 1: Usando Android Studio (Recomendado)

#### Passo 1: Clonar o Repositório
```bash
# Clone o repositório
git clone https://github.com/Dani-Etec/Jokenpo.git

# Navegue até o diretório
cd Jokenpo
```

#### Passo 2: Abrir no Android Studio
1. Abra o **Android Studio**
2. Clique em **File** → **Open**
3. Selecione a pasta `Jokenpo` clonada
4. Aguarde o Android Studio sincronizar o projeto (pode levar alguns minutos)

#### Passo 3: Sincronizar Gradle
- Android Studio sincronizará automaticamente
- Se não sincronizar, clique em **File** → **Sync Now**

#### Passo 4: Baixar SDK e Dependências
- Android Studio baixará automaticamente:
  - Android SDK 36
  - Ferramentas de build
  - Todas as dependências do Gradle

### Método 2: Usando Linha de Comando

#### Passo 1: Clonar o Repositório
```bash
git clone https://github.com/Dani-Etec/Jokenpo.git
cd Jokenpo
```

#### Passo 2: Configurar Permissões (Linux/Mac)
```bash
chmod +x gradlew
```

#### Passo 3: Baixar Dependências
```bash
# Windows
gradlew.bat build

# Linux/Mac
./gradlew build
```

---

## ▶️ Como Executar

### Opção 1: Via Android Studio

#### No Emulador Android
1. Clique em **Run** → **Run 'app'** (ou pressione `Shift + F10`)
2. Selecione um emulador ou crie um novo:
   - **Device Manager** → **Create Device**
   - Escolha um modelo (ex: Pixel 5)
   - Selecione uma API (recomendado: API 31+)
3. Aguarde o aplicativo instalar e abrir no emulador

#### Em um Dispositivo Físico
1. **Ative o Modo de Desenvolvedor** no seu Android:
   - Settings → About Phone → Build Number (toque 7 vezes)
   - De volta em Settings → Developer options → USB Debugging

2. **Conecte o dispositivo** via USB ao computador

3. **Confie na conexão** quando solicitado no telefone

4. Clique em **Run** → **Run 'app'** no Android Studio

5. Selecione seu dispositivo na lista

### Opção 2: Via Linha de Comando

#### Build em Debug
```bash
# Windows
gradlew.bat assembleDebug

# Linux/Mac
./gradlew assembleDebug
```

Arquivo gerado: `app/build/outputs/apk/debug/app-debug.apk`

#### Build em Release
```bash
# Windows
gradlew.bat assembleRelease

# Linux/Mac
./gradlew assembleRelease
```

Arquivo gerado: `app/build/outputs/apk/release/app-release.apk`

#### Instalar no Emulador
```bash
# Iniciando emulador
emulator -avd nome_do_emulador

# Instalando APK
adb install app/build/outputs/apk/debug/app-debug.apk
```

#### Executar a Aplicação
```bash
adb shell am start -n br.gov.sp.jokenpo/.MainActivity
```

### Opção 3: Instalar APK Diretamente

Se você tem um arquivo `.apk`:

```bash
adb install caminho/para/arquivo.apk
```

---

## 🎮 Guia de Uso

### Iniciando um Jogo

1. **Abra o Aplicativo**
   - Toque no ícone do Jokenpo na tela inicial

2. **Veja a Interface**
   - **Topo**: Título "JOKENPÔ"
   - **Meio**: Área onde o computador mostra sua escolha (começa com imagem padrão)
   - **Abaixo**: Mensagem "Computador Jogou:"
   - **Centro**: Resultado da última partida
   - **Fundo**: Três botões com ícones (Pedra, Papel, Tesoura)

### Fazendo uma Jogada

3. **Escolha uma Opção**
   - Toque em um dos três ícones:
     - 🪨 **Pedra** (esquerda)
     - 📄 **Papel** (centro)
     - ✂️ **Tesoura** (direita)

4. **Veja o Resultado**
   - O computador escolhe aleatoriamente
   - Sua escolha é processada
   - Uma das imagens será exibida na área "Computador Jogou:"
   - O resultado será mostrado: **"Você venceu"**, **"Empate"** ou **"Você perdeu"**

### Regras do Jogo

| Sua Escolha | vs | Computador | Resultado |
|------------|----|-----------|---------
| Pedra | vs | Tesoura | ✅ Você venceu |
| Pedra | vs | Papel | ❌ Você perdeu |
| Pedra | vs | Pedra | 🤝 Empate |
| Papel | vs | Pedra | ✅ Você venceu |
| Papel | vs | Tesoura | ❌ Você perdeu |
| Papel | vs | Papel | 🤝 Empate |
| Tesoura | vs | Papel | ✅ Você venceu |
| Tesoura | vs | Pedra | ❌ Você perdeu |
| Tesoura | vs | Tesoura | 🤝 Empate |

### Jogar Novamente

5. **Próxima Rodada**
   - Basta tocar em outro botão e o jogo recomeça automaticamente

---

## 🏗️ Arquitetura do Código

### MainActivity.kt - Estrutura Detalhada

```kotlin
class MainActivity : AppCompatActivity()
```

**Componentes Principais:**

#### 1. Variáveis de Instância
```kotlin
private lateinit var imgComputador : ImageView  // Exibe escolha do PC
private lateinit var txtResultado : TextView     // Exibe resultado
```

#### 2. Ciclo de Vida
```kotlin
override fun onCreate(savedInstanceState: Bundle?)
```
- Inicializa a atividade
- Define o layout da interface
- Configura listeners dos botões

#### 3. Função Principal: `jogar()`
```kotlin
fun jogar(jogador : String)
```

**Lógica da Função:**

```
1. Recebe a escolha do jogador (Pedra, Papel ou Tesoura)
   ↓
2. Gera uma escolha aleatória para o computador
   ↓
3. Exibe a imagem correspondente à escolha do computador
   ↓
4. Compara as escolhas usando lógica condicional
   ↓
5. Determina e exibe o resultado (Empate, Venceu, Perdeu)
```

**Implementação da Lógica Vencedora:**

```kotlin
// Opções disponíveis
val opcoes = arrayOf("Pedra","Papel","Tesoura")

// Escolha aleatória do computador
val computador = opcoes[Random.nextInt(opcoes.size)]

// Exibe a imagem
when(computador){
    "Pedra" -> imgComputador.setImageResource(R.drawable.pedra)
    "Papel" -> imgComputador.setImageResource(R.drawable.papel)
    "Tesoura" -> imgComputador.setImageResource(R.drawable.tesoura)
}

// Verifica o resultado
when {
    computador == jogador -> txtResultado.text = "Empate"
    
    // Condições de vitória
    (jogador == "Pedra" && computador == "Tesoura") || 
    (jogador == "Tesoura" && computador == "Papel") || 
    (jogador == "Papel" && computador == "Pedra") ->
    {
        txtResultado.text = "você venceu"
    }
    
    // Todas as outras condições = derrota
    else -> txtResultado.text = "você perdeu"
}
```

### activity_main.xml - Estrutura de Layout

**Tipo de Layout:** `ConstraintLayout` (responsivo e moderno)

**Componentes Visuais:**

| ID | Tipo | Função |
|----|------|--------|
| `textView` | TextView | Título "JOKENPÔ" |
| `textView2` | TextView | "Computador Jogou:" |
| `imgComputador` | ImageView | Exibe escolha do PC |
| `textView3` | TextView | "Escolha uma opção:" |
| `btnPedra` | ImageView (Clicável) | Botão Pedra |
| `btnPapel` | ImageView (Clicável) | Botão Papel |
| `btnTesoura` | ImageView (Clicável) | Botão Tesoura |
| `txtResultado` | TextView | Resultado (Venceu/Perdeu/Empate) |

**Propriedades do Layout:**
- Fundo cinzento claro
- Alinhamento centralizado
- Padding automático para barra de status
- Constraints para responsividade

---

## 📦 Dependências

### Arquivo: `build.gradle.kts` (app)

```gradle
dependencies {
    // Core Android
    implementation(libs.androidx.core.ktx)          // Extensões do Kotlin para AndroidX
    
    // AppCompat
    implementation(libs.androidx.appcompat)          // Compatibilidade com versões antigas
    
    // Material Design
    implementation(libs.material)                    // Componentes do Material Design 3
    
    // Activity
    implementation(libs.androidx.activity)           // Base para atividades
    
    // Layout
    implementation(libs.androidx.constraintlayout)   // ConstraintLayout para layouts responsivos
    
    // Testes
    testImplementation(libs.junit)                   // Testes unitários
    androidTestImplementation(libs.androidx.junit)   // Testes do Android
    androidTestImplementation(libs.androidx.espresso.core)  // Testes de UI
}
```

### Versões Utilizadas (gradle.properties)

```properties
android.useAndroidX=true                    # Usa bibliotecas AndroidX
kotlin.code.style=official                  # Código Kotlin oficial
android.nonTransitiveRClass=true           # R class isolado por módulo
```

---

## ⚙️ Configuração do Ambiente

### Passo 1: Instalar Java JDK

**Windows:**
```bash
# Verificar instalação
java -version

# Variável de ambiente (se necessário)
set JAVA_HOME=C:\Program Files\Java\jdk-11
```

**macOS:**
```bash
# Instalar via Homebrew
brew install openjdk@11

# Configurar JAVA_HOME
export JAVA_HOME=$(/usr/libexec/java_home -v 11)
```

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get update
sudo apt-get install openjdk-11-jdk

# Verificar
java -version
```

### Passo 2: Instalar Android Studio

1. Baixe de: https://developer.android.com/studio
2. Instale seguindo o wizard
3. Na primeira execução, selecione:
   - Android SDK 36
   - Build Tools 36.x.x
   - Android Emulator

### Passo 3: Configurar Emulador

1. **Abrir Device Manager:**
   - Android Studio → Tools → Device Manager

2. **Criar Novo Dispositivo:**
   - Clique em "Create Device"
   - Selecione um perfil (ex: Pixel 5)
   - Escolha API 31 ou superior
   - Clique em "Finish"

3. **Iniciar Emulador:**
   - Clique no ícone de "Play" do dispositivo

### Passo 4: Configurar Variáveis de Ambiente

**Windows (PowerShell):**
```powershell
[System.Environment]::SetEnvironmentVariable('JAVA_HOME','C:\Program Files\Java\jdk-11','User')
[System.Environment]::SetEnvironmentVariable('ANDROID_HOME','C:\Users\SeuUsuario\AppData\Local\Android\Sdk','User')
```

**macOS/Linux (adicione ao ~/.bash_profile ou ~/.zshrc):**
```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 11)
export ANDROID_HOME=$HOME/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools
```

---

## 🐛 Troubleshooting

### Problema 1: "Gradle Sync Failed"

**Solução:**
```bash
# Limpar cache do Gradle
gradlew clean

# Sincronizar novamente
gradlew build
```

### Problema 2: "Could not find SDK Version 36"

**Solução:**
1. Abra Android Studio
2. Vá em Tools → SDK Manager
3. Clique em "SDK Platforms"
4. Marque "Android 15 (API 36)"
5. Clique em "Apply"

### Problema 3: "Device is offline" (Emulador)

**Solução:**
```bash
# Reiniciar adb
adb kill-server
adb start-server

# Ou reiniciar o emulador no Device Manager
```

### Problema 4: "Module not found: :app"

**Solução:**
1. Verifique se a pasta `app` existe
2. Verifique `settings.gradle.kts` contém `include(":app")`
3. Clique em File → Sync Now

### Problema 5: "Compilação Falha - Erros de Kotlin"

**Solução:**
```bash
# Limpar e reconstruir
gradlew clean build

# Se persistir, deletar pasta build
rm -rf app/build
gradlew build
```

### Problema 6: "Android Studio não reconhece emulador"

**Solução:**
```bash
# Listar dispositivos conectados
adb devices

# Reiniciar adb
adb kill-server
adb start-server

# Relançar emulador
```

### Problema 7: "Permission denied: './gradlew'" (Linux/Mac)

**Solução:**
```bash
chmod +x gradlew
chmod +x gradlew.bat
```

### Problema 8: "Versão do Gradle incompatível"

**Solução:**
```bash
# Usar gradle wrapper (recomendado)
./gradlew wrapper --gradle-version=8.x.x

# Ou editar gradle-wrapper.properties
```

---

## 📊 Especificações Técnicas

### Versões de Compatibilidade

| Componente | Versão |
|-----------|--------|
| API Mínima | 24 (Android 7.0 Nougat) |
| API Alvo | 36 (Android 15) |
| Compilação | 36 (Android 15) |
| Java | Versão 11+ |
| Kotlin | 1.9+ |
| Gradle | 8.x |

### Recursos Utilizados

- ✅ ImageView para botões e exibição
- ✅ TextView para textos
- ✅ ConstraintLayout para layout responsivo
- ✅ Kotlin Random para decisões aleatórias
- ✅ View Binding (implícito via findViewById)
- ✅ Edge-to-Edge (Android 12+)

### Tamanho da Aplicação

- **Debug APK**: ~2-3 MB
- **Release APK**: ~1-2 MB (com minificação)

---

## 🔧 Comandos Úteis

```bash
# Sincronizar Gradle
gradlew sync

# Limpar projeto
gradlew clean

# Construir debug
gradlew assembleDebug

# Construir release
gradlew assembleRelease

# Executar testes
gradlew test

# Instalar em dispositivo
adb install app/build/outputs/apk/debug/app-debug.apk

# Ver logs do aplicativo
adb logcat

# Desinstalar aplicativo
adb uninstall br.gov.sp.jokenpo
```

---

## 📱 Screenshots & Componentes

### Interface Principal

```
┌─────────────────────────────┐
│      🎮 JOKENPÔ 🎮          │
│                             │
│  Computador Jogou:          │
│     [Imagem do PC]          │
│                             │
│      Resultado              │
│   (Empate/Venceu/Perdeu)    │
│                             │
│   Escolha uma opção:        │
│  🪨    📄    ✂️             │
│ Pedra Papel Tesoura         │
└─────────────────────────────┘
```

---

## 👨‍💻 Autor

**Dani-Etec**
- GitHub: [@Dani-Etec](https://github.com/Dani-Etec)
- Repositório: [Jokenpo](https://github.com/Dani-Etec/Jokenpo)

---

## 📄 Licença

Este projeto é um projeto educacional desenvolvido como parte de atividades de aprendizado em desenvolvimento Android.

---

## 🤝 Contribuições

Contribuições são bem-vindas! Para contribuir:

1. Faça um Fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/MinhaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona MinhaFeature'`)
4. Push para a branch (`git push origin feature/MinhaFeature`)
5. Abra um Pull Request

---

## 📞 Suporte

Para dúvidas ou problemas:
1. Verifique a seção [Troubleshooting](#troubleshooting)
2. Abra uma [Issue](https://github.com/Dani-Etec/Jokenpo/issues) no GitHub
3. Consulte a documentação oficial do Android

---

## 📚 Recursos Adicionais

- [Documentação Oficial do Android](https://developer.android.com/docs)
- [Kotlin Documentation](https://kotlinlang.org/docs/)
- [AndroidX Library Documentation](https://developer.android.com/jetpack)
- [Material Design Guidelines](https://material.io/design)
- [Android Gradle Plugin Documentation](https://developer.android.com/build)

---

**Última atualização:** Setembro de 2026
**Status:** ✅ Funcional e pronto para uso
