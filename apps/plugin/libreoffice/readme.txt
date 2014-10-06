LibreOffice'i spelleri kompileerimiseks:

1. Kompileeri native kood kataloogist cpp ja kopeeri v�ljundfailid kataloogi oxt/
1.1 Windowsil MSVC 2007-ga
  Projektifail: cpp/ooofslinget.sln
  V�ljundfail: ooofslinget.win_x86
1.2 Macil XCode 3-ga
  Projektifail: cpp/ooofslinget.xcodeproj
  V�ljundfail: ooofslinget.mac
1.3.1 x86-32 Linuxil gcc-ga
  K�ivitage make -f unix/Makefile_cpp
  V�ljundfail: oofslinget.lin -> ooofslinget.lin_x86
1.3.2 x86-64 Linuxil gcc-ga
  K�ivitage make -f unix/Makefile_cpp
  V�ljundfail: oofslinget.lin -> ooofslinget.lin_x64

2. Kompileeri LibreOffice arenduskeskkonnas java kood
  K�ivitage make -f unix/Makefile_java
  Kopeerige v�ljundfailid *.jar oxt/ kataloogi
  
3. Lisage s�nastik
  Kopeerige /dct/et.dct -> oxt/fslinget.lex

4. Valmistage installipakk
  Kui 7za ei asu PATHis, kopeerige see oxt kataloogi
  K�ivitage oxt kataloogis _build.bat
