Git - good practices

* commit powinien miec dobry opis
* commit powinien zawierac dobra nazwe
* zmiana opisu tylko dla ostatniego commita(amend)
* podrozuj po historii i branchach tylko przy czystym drzewie roboczym
* usuwanie branchy
    * zmergowany branch mozna usunac
    * nie powinnismy usuwac nie zmergowanych branchy bo nie bedziemy w stanie wrocic do nich
    * nie usuwamy branch na ktorym aktualnie sie znajdujemy
* zmergowany branch mozna usunac
* git flow - w skrocie
    * master - branch releasowy
    * develop - branch developerski
    * feature branch - branch do rozwoju funkcjonalnosci
    * fetaure branch powinien startowac od developa i do niego finalnie zostac zmergowany
* branch
    * wlasny branch nie musi byc idealny (moze nie dzialac, moze zawierac FIXME or TODO),
      ale wyslanie merge requesta z tego brancha MUSI zawierac piekny kod

Git - przydatne komendy
* git status
* git add .
* git commit -m "[tag] - message"
* git restore --staged file-name // zdejmij ze stage'a
* git checkout branch-name // przelacz sie na branch name
* git checkout -b branch-name // przelacz na nowo utworzony branch
* git log -- graph // rysuje graf historii w konsoli
