import {Component, OnInit} from '@angular/core';
import {RouterOutlet} from '@angular/router';
import {StarWarsCharacter} from "./star-wars-character";
import {NgForOf} from "@angular/common";

@Component({
    selector: 'app-root',
    standalone: true,
    imports: [RouterOutlet, NgForOf],
    templateUrl: './app.component.html',
    styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {

    // characters: StarWarsCharacter[] = [];
    characters: StarWarsCharacter[] = [
        {name: 'Luke Skywalker', species: 'Human', homeWorld: 'Tatooine', affiliation: 'Rebel Alliance'},
        {name: 'Darth Vader', species: 'Human', homeWorld: 'Tatooine', affiliation: 'Galactic Empire'},
        {name: 'Leia Organa', species: 'Human', homeWorld: 'Alderaan', affiliation: 'Rebel Alliance'},
        {name: 'Yoda', species: 'Yoda species', homeWorld: 'Unknown', affiliation: 'Jedi Order'},
        {name: 'Han Solo', species: 'Human', homeWorld: 'Corellia', affiliation: 'Rebel Alliance'},
        {name: 'Chewbacca', species: 'Wookiee', homeWorld: 'Kashyyyk', affiliation: 'Rebel Alliance'},
        {name: 'Palpatine', species: 'Human', homeWorld: 'Naboo', affiliation: 'Galactic Empire'}
    ];

    constructor() {
    }

    ngOnInit(): void {
    }

}
