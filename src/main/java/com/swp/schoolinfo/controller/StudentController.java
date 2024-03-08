package com.swp.schoolinfo.controller;

import com.swp.schoolinfo.model.Student;
import com.swp.schoolinfo.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
    private final StudentService studentService;

    public StudentController(@Autowired StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/add")
    @Operation(summary = "Add student",
            description = "Adds a new student to the system",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully created"),
                    @ApiResponse(responseCode = "400", description = "Invalid request")
            })
    public Student add(@RequestBody Student student) {
        return studentService.add(student);
    }

    @DeleteMapping("/remove")
    @Operation(summary = "Remove student",
            description = "Removes a student from the system",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully removed"),
                    @ApiResponse(responseCode = "400", description = "Invalid request")
            })
    public Student remove(@RequestBody Student student) {
        return studentService.remove(student);
    }

    @GetMapping("/search")
    @Operation(summary = "Search student",
            description = "Searches for a student in the system",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Success"),
                    @ApiResponse(responseCode = "400", description = "Invalid request"),
                    @ApiResponse(responseCode = "404", description = "Student not found")
            })
    public Student search(@RequestBody Student student) {
        return studentService.search(student);
    }

    @PutMapping("/set")
    @Operation(summary = "Update student",
            description = "Updates a student's information",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully updated"),
                    @ApiResponse(responseCode = "400", description = "Invalid request")
            })
    public Student set(@RequestParam Integer index, @RequestBody Student student) {
        return studentService.set(index, student);
    }

    @GetMapping("/allStudents")
    @Operation(summary = "Get all students",
            description = "Retrieves a list of all students in the system",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Success"),
                    @ApiResponse(responseCode = "400", description = "Invalid request")
            })
    public List<Student> allStudents() {
        return studentService.allStudents();
    }
}