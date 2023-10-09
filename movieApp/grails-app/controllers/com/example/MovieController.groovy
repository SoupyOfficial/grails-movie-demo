package com.example;

import groovy.transform.CompileStatic;

@CompileStatic
public class MovieController {
    static allowedMethods = [index: 'GET', show: 'GET']

    MovieDataService movieDataService

    def index() {
        [movieList: movieDataService.findAll()]
    }

    def show(Long id) {
        [movieInstance: movieDataService.findById(id)]
    }
}
