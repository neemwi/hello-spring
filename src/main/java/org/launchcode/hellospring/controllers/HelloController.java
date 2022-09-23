package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

//@RequestMapping("/hello")
public class HelloController {

//     Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }
    //lives /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // live /hello/hello
    //Create a handler that handles request of the form/ hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }


    // Handles request of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParameter(@PathVariable String name) {
        return "Hi, " + name + "!";
    }
    // lives /hello/form
//    @GetMapping("form")
//    public String helloForm() {
//        String html =
//                "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" + // submit a request to /hello
//                "<input type='text' name='name'>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//
//        return html;
//    }

    //@RequestMapping(value="hello", method = RequestMethod.GET)
//    @GetMapping("form")
//    public String helloLanguage() {
//        String html =
//                "<html>" +
//                        "<body>" +
//                        "<form action='hello' method='post'>" + // submit a request to /hello
//                        "<input type='text' name='name'>" +
//                        "<select name='language' id='lang'>" +
//                        "<option value=''>--Please choose a language--</option> " +
//                        "<option value='eng'>English</option>" +
//                        "<option value='fr'>French</option>" +
//                        "<option value='spa'>Spanish</option>" +
//                        "<option value='chi'>Chinese</option>" +
//                        "<option value='ita'>Italian</option>" +
//                        "<input type='submit' value='Greet me!'>" +
//                        "</select>" +
//                        "</form>" +
//                        "</body>" +
//                        "</html>";
//
//        return html;
//    }
//
////    @RequestMapping(value="hello", method = RequestMethod.POST)
//    @ResponseBody
//    public String helloPost(@RequestParam String name, @RequestParam String language) {
//        if (name == null) {
//            name = "World";
//        }
//
//        return createMessage(name, language);
//
//    }
//
//
//    public static String createMessage(@RequestParam String name, @RequestParam String language ) {
//        if(name.equals("")){
//            name = "World";
//        }
//        String greeting = "";
//
//        if (language.equals("eng")) {
//            greeting =  "Hello, ";
//        } else if (language.equals("fr")) {
//            greeting = "Bonjour, ";
//        } else if (language.equals("spa")) {
//            greeting = "Hola, ";
//        } else if (language.equals( "chi")) {
//            greeting = "Chi Hao, ";
//        } else if (language.equals("ita")) {
//            greeting = "Ciao, ";
//        }
//
//        return greeting + name + "!";
//    }

    @RequestMapping(value="hello", method = RequestMethod.GET)
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' />" +
                "</br></br>" +
                "<select name = 'language' id='lang'>" +
                "<option value = 'Fi'>Finnish</option>" +
                "<option value = 'Ta'>Tagalog</option>" +
                "<option value = 'Po'>Polish</option>" +
                "<option value = 'Ir'>Irish</option>" +
                "<option value = 'Si'>Sinhala</option>" +
                "</select>" +
                "</br></br>" +
                "<form action = '/hello' method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @RequestMapping(value="hello", method = RequestMethod.POST)
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }

        return createMessage(name, language);

        // For a bonus mission, students can change this response text to look nicer.
        // This is subjective, but students should be modifying the HTML of the response string.
    }


    //    Exercises
    //@RequestMapping(method = RequestMethod.POST, value = "hello")
    public static String createMessage(@RequestParam String name, @RequestParam String language ) {
        if(name.equals("")){
            name = "World";
        }
        String greeting = "";

        if (language.equals("Fi")) {
            greeting =  "Moi, ";
        } else if (language.equals("Ta")) {
            greeting = "Kumusta, ";
        } else if (language.equals("Po")) {
            greeting = "Siema, ";
        } else if (language.equals( "Ir")) {
            greeting = "Dia duit, ";
        } else if (language.equals("Si")) {
            greeting = "Subha davasak, ";
        }

        return greeting + name + "!";
    }



}