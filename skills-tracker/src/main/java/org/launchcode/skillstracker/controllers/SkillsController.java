package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h3>List of Languages We Want To Learn<h3/>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>TypeScript</li>" +
                "<ol/>" +
                "<p>Click <a href='/form'>here<a/> to select your favorite</p>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displayProgramLangsForm() {
        return "<html>" +
                "<body>" +
                "<form action ='/form' method='POST'" +
                "<label> Name:</label>" +
                "<input type='text' name='userName' /><br />" +
                "<label>My Favorite Programming Language:</label>" +
                "<select name ='lang1'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "</select><br />" +
                "<label>My Second Favorite Programming Language:</label>" +
                "<select name ='lang2'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "</select><br />" +
                "<label>My Third Favorite Programming Language:</label>" +
                "<select name ='lang3'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "</select><br />" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
        public String skillsOutput(@RequestParam String userName, String lang1, String lang2, String lang3) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        }

}
