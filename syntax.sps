* Encoding: UTF-8.
* NOTE: Change the .sav URL directory before running the following commands.
GET
  FILE='C:\Users\filip\OneDrive\Documentos\data.sav'.
DATASET NAME Data WINDOW=FRONT.
DATASET ACTIVATE Data.

* Box plot of the total time spent by the participants in the execution of the tasks

EXAMINE VARIABLES=TotalTime BY Group
  /COMPARE VARIABLE
  /PLOT=BOXPLOT
  /STATISTICS=NONE
  /NOTOTAL
  /MISSING=LISTWISE.

* Summary  of  the  answers  to  the  background questionnaire

T-TEST GROUPS=Group(0 1)
  /MISSING=ANALYSIS
  /VARIABLES= BG1 BG2 BG3 BG4 BG5
  /CRITERIA=CI(.95).

NPAR TESTS
  /M-W=  BG1 BG2 BG3 BG4 BG5 BY Group(0 1)
  /MISSING ANALYSIS
  /METHOD=EXACT TIMER(5).

*  Summary  of  the  MW-U  statistic  results  for  the context switching variable

T-TEST GROUPS=Group(0 1)
  /MISSING=ANALYSIS
  /VARIABLES=T11ED T12ED T21ED T22ED T31ED T32ED
  /CRITERIA=CI(.95).

NPAR TESTS
  /M-W= T11ED T12ED T21ED T22ED T31ED T32ED BY Group(0 1)
  /MISSING ANALYSIS
  /METHOD=EXACT TIMER(5).

* Box plot of the tasks duration variable in both treatments

EXAMINE VARIABLES=T11Time T12Time T21Time T22Time T31Time T32Time BY Group
  /COMPARE VARIABLE
  /PLOT=BOXPLOT
  /STATISTICS=NONE
  /NOTOTAL
  /MISSING=LISTWISE.

* Summary of the statistical tests’ results for the tasks duration variable.

T-TEST GROUPS=Group(0 1)
  /MISSING=ANALYSIS
  /VARIABLES=T11Time T12Time T21Time T22Time T31Time T32Time
  /CRITERIA=CI(.95).

NPAR TESTS
  /M-W= T11Time T12Time T32Time BY Group(0 1)
  /MISSING ANALYSIS
  /METHOD=EXACT TIMER(5).

* Box plot of the number of access to the internal and external documentation, related to the software comprehension activity

EXAMINE VARIABLES=T11ID T11ED T21ID T21ED T31ID T31ED BY Group
  /COMPARE VARIABLE
  /PLOT=BOXPLOT
  /STATISTICS=NONE
  /NOTOTAL
  /MISSING=LISTWISE.

* Box  plot  of  the  number  of  access  to  theinternal  (ID)  and  external  (ED)  documentation,  related  to the documenting activity

EXAMINE VARIABLES=T12ID T12ED T32ID T32ED BY Group
  /COMPARE VARIABLE
  /PLOT=BOXPLOT
  /STATISTICS=NONE
  /NOTOTAL
  /MISSING=LISTWISE.

* Box plot of the Q1 and Q2 in both treatments

EXAMINE VARIABLES=Q1 Q2 BY Group
  /COMPARE VARIABLE
  /PLOT=BOXPLOT
  /STATISTICS=NONE
  /NOTOTAL
  /MISSING=LISTWISE.

* Summary of the MW-U statistic results for the final questionnaire

T-TEST GROUPS=Group(0 1)
  /MISSING=ANALYSIS
  /VARIABLES=Q1 Q2 Q3
  /CRITERIA=CI(.95).

NPAR TESTS
  /M-W= Q1 Q2 Q3 BY Group(0 1)
  /MISSING ANALYSIS
  /METHOD=EXACT TIMER(5).

* Bar chart showing whether the participants felt that using a remote environment had a negative impact in the experiment

GRAPH
  /BAR(GROUPED)=COUNT BY Q3 BY Group.
