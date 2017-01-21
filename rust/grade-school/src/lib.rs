use std::collections::BTreeMap;

pub struct School {
    pub grades: BTreeMap<u8, Vec<String>>,
}

impl School {
    pub fn new() -> Self {
        School {
            grades: BTreeMap::new(),
        }
    }

    pub fn grades(&self) -> Vec<u8>{
        self.grades.keys().cloned().collect::<Vec<u8>>()
    }

    pub fn grade(&self, grade: u8) -> Option<&Vec<String>> {
        self.grades.get(&grade)
    }

    pub fn add(&mut self, grade: u8, name: &str) {
        let mut names = self.grades.entry(grade).or_insert(vec![]);
        names.push(name.to_string());
        names.sort();
    }


}
