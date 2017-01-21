pub struct Allergies (pub u32);

#[derive (Debug, PartialEq, Clone)]
pub enum Allergen {
    Eggs = 1,
    Peanuts = 2,
    Shellfish = 4,
    Strawberries = 8,
    Tomatoes = 16,
    Chocolate = 32,
    Pollen = 64,
    Cats = 128
}

use Allergen::*;

const ALLERGENS: [Allergen; 8] = [Eggs, Peanuts, Shellfish, Strawberries, Tomatoes, Chocolate, Pollen, Cats];

impl Allergies {
    pub fn is_allergic_to(&self, a: &Allergen) -> bool {
        (self.0 & a.clone() as u32) != 0

    }

    pub fn allergies(&self) -> Vec<Allergen> {
        ALLERGENS.iter()
                .filter(|x| self.is_allergic_to(x))
                .cloned()
                .collect()
    }
}
