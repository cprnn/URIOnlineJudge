a = input()
b = input()
c = input()

tipo = dict({
    'vertebrado': {
        'ave': {
            'carnivoro': 'aguia',
            'onivoro': 'pomba',
        },
        'mamifero': {
            'onivoro': 'homem',
            'herbivoro': 'vaca',
        },
    },
    'invertebrado': {
        'inseto': {
            'hematofogo': 'pulga',
            'herbivoro': 'lagarta',
        },
        'anelideo': {
            'hematofago': 'sanguessuga',
            'onivoro': 'minhoca',
        }
    }

})

print(tipo[a][b][c])
