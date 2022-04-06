package Engine.Window;

import Engine.Character.NonPlayerCharacter;
import Engine.Character.PlayerCharacter;
import Engine.Window.Animations.Sprite;
import Engine.Window.Rectangle.Rectangle;

import java.util.List;

public class Window {
    // The window handler
    private static Window instance;
    private long window;
    private int height, width;
    private String background;
    private PlayerCharacter player;
    private List<NonPlayerCharacter> NPCs;
    private List<Rectangle> gameElements;

    private Window(int height, int width){
        this.height = height;
        this.width = width;
    }
    private Window(){
    }

    public static Window create(){
        if(instance == null)
            instance = new Window();
        return instance;
    }

    public static Window create(int height, int width){
        if(instance == null){
            instance = new Window();
        }
        instance.setSize(height, width);
        return instance;
    }

    public static Window createFullScreenWindow(){
        if(instance == null){
            instance = new Window();
        }
        instance.setFullscreen();
        return instance;
    }

    public void setFullscreen(){
        // Set window to fullscreen
    }

    public void setSize(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setBackground(String background){
        this.background = background;
    }

    public void drawSprite(Sprite sprite, int x, int y){
    }

    public PlayerCharacter getPlayer() {
        return player;
    }

    public void setPlayer(PlayerCharacter player) {
        this.player = player;
    }

    public void addNPC(NonPlayerCharacter NPC){
        NPCs.add(NPC);
    }
    public void addGameElement(Rectangle rectangle){
        gameElements.add(rectangle);
    }
//    Code copied from LWJGL
//    public void run() {
//        System.out.println("Hello LWJGL " + Version.getVersion() + "!");
//
//        init();
//        loop();
//
//        // Free the window callbacks and destroy the window
//        glfwFreeCallbacks(window);
//        glfwDestroyWindow(window);
//
//        // Terminate GLFW and free the error callback
//        glfwTerminate();
//        glfwSetErrorCallback(null).free();
//    }
//
//    private void init() {
//        // Setup an error callback. The default implementation
//        // will print the error message in System.err.
//        GLFWErrorCallback.createPrint(System.err).set();
//
//        // Initialize GLFW. Most GLFW functions will not work before doing this.
//        if ( !glfwInit() )
//            throw new IllegalStateException("Unable to initialize GLFW");
//
//        // Configure GLFW
//        glfwDefaultWindowHints(); // optional, the current window hints are already the default
//        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE); // the window will stay hidden after creation
//        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE); // the window will be resizable
//
//        // Create the window
//        window = glfwCreateWindow(300, 300, "Hello World!", NULL, NULL);
//        if ( window == NULL )
//            throw new RuntimeException("Failed to create the GLFW window");
//
//        // Setup a key callback. It will be called every time a key is pressed, repeated or released.
//        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
//            if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
//                glfwSetWindowShouldClose(window, true); // We will detect this in the rendering loop
//        });
//
//        // Get the thread stack and push a new frame
//        try ( MemoryStack stack = stackPush() ) {
//            IntBuffer pWidth = stack.mallocInt(1); // int*
//            IntBuffer pHeight = stack.mallocInt(1); // int*
//
//            // Get the window size passed to glfwCreateWindow
//            glfwGetWindowSize(window, pWidth, pHeight);
//
//            // Get the resolution of the primary monitor
//            GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
//
//            // Center the window
//            glfwSetWindowPos(
//                    window,
//                    (vidmode.width() - pWidth.get(0)) / 2,
//                    (vidmode.height() - pHeight.get(0)) / 2
//            );
//        } // the stack frame is popped automatically
//
//        // Make the OpenGL context current
//        glfwMakeContextCurrent(window);
//        // Enable v-sync
//        glfwSwapInterval(1);
//
//        // Make the window visible
//        glfwShowWindow(window);
//    }
//
//    private void loop() {
//        // This line is critical for LWJGL's interoperation with GLFW's
//        // OpenGL context, or any context that is managed externally.
//        // LWJGL detects the context that is current in the current thread,
//        // creates the GLCapabilities instance and makes the OpenGL
//        // bindings available for use.
//        GL.createCapabilities();
//
//        // Set the clear color
//        glClearColor(0.5f, 0.5f, 1.0f, 0.0f);
//        // (102, 255, 102)
//
//        // Run the rendering loop until the user has attempted to close
//        // the window or has pressed the ESCAPE key.
//        while ( !glfwWindowShouldClose(window) ) {
//            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // clear the framebuffer
//
//            glfwSwapBuffers(window); // swap the color buffers
//
//            // Poll for window events. The key callback above will only be
//            // invoked during this call.
//            glfwPollEvents();
//        }
//    }
}
