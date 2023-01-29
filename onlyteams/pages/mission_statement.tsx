import Header from "../components/header";
import Footer from "../components/footer";

export default function MissionStatement() {
  return (
    <>
      <Header />
      <body className="h-screen bg-white">
        <div className="flex flex-col items-center justify-center">
          <h1 className="pt-10 font-bold text-3xl text-slate-900">
            <hr className="w-1/2" />
            Mission Statement
          </h1>
          <hr className="w-1/3 bg-slate-800 h-1 mt-3" />
          <p className="pt-10 text-xl text-slate-900 text-left w-2/3">
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
            eiusmod tempor incididunt ut labore et dolore magna aliqua. Sodales
            neque sodales ut etiam. Interdum varius sit amet mattis vulputate
            enim. Nibh venenatis cras sed felis eget velit. Non quam lacus
            suspendisse faucibus interdum posuere lorem ipsum dolor. Sed
            vulputate mi sit amet mauris. Leo duis ut diam quam nulla porttitor
            massa. Tristique risus nec feugiat in fermentum posuere urna nec
            tincidunt. Nunc sed velit dignissim sodales ut eu sem integer vitae.
            Fringilla ut morbi tincidunt augue interdum velit euismod. Eget
            gravida cum sociis natoque. Facilisis magna etiam tempor orci eu
            lobortis elementum nibh tellus. Maecenas volutpat blandit aliquam
            etiam erat velit scelerisque in. Integer eget aliquet nibh praesent
            tristique. Dictum at tempor commodo ullamcorper a lacus. Et netus et
            malesuada fames ac turpis egestas integer eget. Tincidunt id aliquet
            risus feugiat in ante. Purus viverra accumsan in nisl. Gravida neque
            convallis a cras semper. A diam sollicitudin tempor id eu nisl nunc.
            Id volutpat lacus laoreet non curabitur gravida arcu ac. Eget
            egestas purus viverra accumsan in. Vel pharetra vel turpis nunc.
            Volutpat maecenas volutpat blandit aliquam etiam. Justo donec enim
            diam vulputate ut pharetra sit amet aliquam. Cursus mattis molestie
            a iaculis at erat. A diam sollicitudin tempor id eu. Eleifend donec
            pretium vulputate sapien nec. Et tortor at risus viverra adipiscing.
            Risus ultricies tristique nulla aliquet. Eu consequat ac felis
            donec. Hac habitasse platea dictumst vestibulum rhoncus est
            pellentesque. Ipsum suspendisse ultrices gravida dictum.
          </p>
        </div>
      </body>
      <Footer />
    </>
  );
}
