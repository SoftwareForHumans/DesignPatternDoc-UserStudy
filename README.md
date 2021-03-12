# Design-Pattern-DocUserStudy

This repository contains an experimental package for an empirical study conducted to show the benefits and liabilities of documenting pattern instances using an approached based on [good practices for software documentation](http://www.hillside.net/plop/2009/papers/ACMVersions/correia.pdf) and on [liveness principles](https://dl.acm.org/doi/10.1145/3328433.3328456). The study uses the [Design-Pattern-Doc plugin](https://github.com/lemosf-ppb/Design-Pattern-Doc) for the IntelliJ IDEA IDE.

 - `Task1/`- Resources provided to study participants for the first task of the experiment
 - `Task2/`- Resources provided to study participants for the second task of the experiment
 - `Task3/`- Resources provided to study participants for the third task of the experiment
 - `answers/` - Questionnaire answers given by the participants during the experiment, and later incorporated into the `data.csv`/`data.sav` files
 - `questionnaire/` - Questionnaire provided to the participants during the experiment. Contains the background questions, the plugin walkthrough (for the experimental group), the task instructions and the assessment questions
 - `DesignPatternsReferenceCard.pdf` - Reference card used as _external documentation_ by the participants during the experiment.
 - `README.md` - This file
 - `data.csv`/`data.sav` - Data collected during the experiment.
   > **Note:** 
   > - T{x}Time - The time (in seconds) spent during task x
   > - T{x}ED - The number of access to the provided external documentation during task x
   > - T{x}ID - The number of access to the internal documentation during task x
   > - BG{x} - Numerical representation of the answer to the background question x (eg. Strongly disagree = 1, Strongly agree = 5)
   > - Q{x} - Numerical representation of the answer to the question x of the final questionnaire
   > - Group - 0 if that data row corresponds to someone from the control group or 1 if it does not
   > - TotalTime - The time (in seconds) spent during the entire experiment 
 - `syntax.sps` - The SPSS syntax that can be used to obtain the experiment box-plots and the MW/t-tests
 - `pattern_instances.xml` - The Design-Pattern-Doc persisted documentation which is used for the experimental group. The plugin generates a new file on the location: "..\.IntelliJIdea{version}\config\options" if it does not find that file on this directory. Should be overrided by the provided file to replicate Task2.
