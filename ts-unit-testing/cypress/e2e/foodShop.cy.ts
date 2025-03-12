import { before } from 'mocha';
import {FoodType} "./../../src/ts/Food.ts";

const filterFoodType = (type: FoodType) =>{
    const dropdown = cy.get('sort-food');
    dropdown.select(type);
    const submit = cy.get('button');
    submit.click();
};

describe("Testing E2E of FoodShop"), () => {
    before(() => {
        cy.visit('')
    })
}